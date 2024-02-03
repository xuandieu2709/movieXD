package vn.xdeuhug.movieXD.ui.activity

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.widget.Toast
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import org.jetbrains.anko.startActivity
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivityDetailMovieBinding
import vn.xdeuhug.movieXD.http.GetDetailMovieAPI
import vn.xdeuhug.movieXD.model.modelDetailMovie.Genre
import vn.xdeuhug.movieXD.model.modelDetailMovie.ResponseDetailMovie
import vn.xdeuhug.movieXD.router.API2EmbedRouter
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.ui.adapter.GenreAdapter
import vn.xdeuhug.movieXD.utils.AppUtils
import vn.xdeuhug.movieXD.utils.DateUtils
import vn.xdeuhug.movieXD.utils.PhotoShowUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
@Suppress("DEPRECATION")
class DetailMovieActivity : AppActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var movie: ResponseDetailMovie

    private lateinit var genreAdapter: GenreAdapter
    private var listGenre = ArrayList<Genre>()

    override fun getLayoutView(): View {
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        val id = intent.getIntExtra(AppConstants.ID_IMDB, -1)
        getDetailMovie(id)
        setClickButtonPlay()
        clickBack()
    }

    private fun clickBack() {
        binding.btnBack.clickWithDebounce {
            finish()
        }
    }

    private fun initMovieTrailer() {
        binding.itemDetail.wvTrailer.webChromeClient = WebChromeClient()
        binding.itemDetail.wvTrailer.settings.loadsImagesAutomatically = true
        binding.itemDetail.wvTrailer.settings.javaScriptEnabled = true
        binding.itemDetail.wvTrailer.settings.allowFileAccess = true
        binding.itemDetail.wvTrailer.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        binding.itemDetail.wvTrailer.settings.javaScriptCanOpenWindowsAutomatically = true
        binding.itemDetail.wvTrailer.settings.pluginState = WebSettings.PluginState.ON
        binding.itemDetail.wvTrailer.settings.mediaPlaybackRequiresUserGesture = false
        binding.itemDetail.wvTrailer.settings.domStorageEnabled = true
        binding.itemDetail.wvTrailer.settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        binding.itemDetail.wvTrailer.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        binding.itemDetail.wvTrailer.requestFocus(View.FOCUS_DOWN)
        if (movie.videos.results.isNotEmpty()) {
            val html =
                "<html><body style='margin:0;padding:0;'><iframe width=\"100%\" height=\"100%\" src=\"${API2EmbedRouter.SERVER_YOUTUBE_EMBED}${movie.videos.results[0].key}\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>"
            binding.itemDetail.wvTrailer.loadData(html, "text/html", null)
        }
    }

    private fun setClickButtonPlay() {
        binding.itemDetail.llPlay.clickWithDebounce {
            if (movie.status in arrayListOf("Released", "Returning Series", "Ended")) {
                startActivity<PlayMediaActivity>(
                    AppConstants.ID_IMDB_STR to movie.imdbId,
                    AppConstants.TYPE_MOVIE to AppConstants.IS_TYPE_MOVIE
                )
            } else {
                Toast.makeText(
                    getContext(), "Phim này sẽ sớm ra mắt vào ngày - ${
                        DateUtils.formatDate(
                            movie.releaseDate
                        )
                    }", Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun initData() {
        //
    }

    private fun initGenre() {
        genreAdapter = GenreAdapter(getContext())
        listGenre.addAll(movie.genres)
        genreAdapter.setData(listGenre)
        // Create recycleView
        AppUtils.initRecyclerViewVerticalWithFlexBoxLayout(binding.itemHead.rvGenre, genreAdapter)
    }

    private fun getDetailMovie(id: Int) {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB_MOVIE)
            .api(GetDetailMovieAPI.params(id))
            .request(object : HttpCallbackProxy<ResponseDetailMovie>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onHttpSuccess(result: ResponseDetailMovie) {
                    movie = result
                    setDataForView()
                    initMovieTrailer()
                    initGenre()
                }
            })
    }

    @SuppressLint("SetTextI18n")
    private fun setDataForView() {
        PhotoShowUtils.loadPhotoImageNormal(
            APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + movie.posterPath,
            binding.itemHead.imvPoster
        )
        binding.itemHead.tvTitle.text = movie.title
        if (movie.releaseDate.isNotEmpty()) {
            binding.itemHead.tvReleaseDate.text = DateUtils.formatDate(
                movie.releaseDate
            )
        } else {

            binding.itemHead.tvReleaseDate.text = "Không xác định"
        }
        binding.itemHead.tvVoteCount.text = "Đánh giá: ${movie.voteAverage}/10"
        binding.itemHead.tvSumVoteCount.text =
            "Số lượng đánh giá: ${AppUtils.getMoneyFormatted(movie.voteCount.toBigDecimal())}"
        binding.itemDetail.tvContent.text = movie.overview
    }
}