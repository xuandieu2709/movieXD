package vn.xdeuhug.movieXD.ui.activity

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.widget.Toast
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import org.jetbrains.anko.startActivity
import vn.xdeuhug.movieXD.R
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivityDetailMovieTvBinding
import vn.xdeuhug.movieXD.http.GetDetailTVMovieAPI
import vn.xdeuhug.movieXD.model.modelDetailMovie.Genre
import vn.xdeuhug.movieXD.model.modelTVMovie.Episode
import vn.xdeuhug.movieXD.model.modelTVMovie.ResponeTVMovie
import vn.xdeuhug.movieXD.model.modelTVMovie.Season
import vn.xdeuhug.movieXD.router.API2EmbedRouter
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.ui.adapter.EpisodeAdapter
import vn.xdeuhug.movieXD.ui.adapter.GenreAdapter
import vn.xdeuhug.movieXD.ui.adapter.SeasonAdapter
import vn.xdeuhug.movieXD.utils.AppUtils
import vn.xdeuhug.movieXD.utils.DateUtils
import vn.xdeuhug.movieXD.utils.PhotoShowUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 02 / 02 / 2024
 */
@Suppress("DEPRECATION")
class DetailMovieTVActivity : AppActivity(), SeasonAdapter.OnClickItemSeason,
    EpisodeAdapter.OnClickItemEpisode {
    private lateinit var movie: ResponeTVMovie
    private lateinit var binding: ActivityDetailMovieTvBinding

    private lateinit var genreAdapter: GenreAdapter
    private var listGenre = ArrayList<Genre>()

    private lateinit var seasonAdapter: SeasonAdapter
    private var listSeason = ArrayList<Season>()
    private lateinit var seasonSelected:Season

    private lateinit var episodeAdapter: EpisodeAdapter
    private var listEpisode = ArrayList<Episode>()

    private var season = 1
    private var episode = 1

    override fun getLayoutView(): View {
        binding = ActivityDetailMovieTvBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        val id = intent.getIntExtra(AppConstants.ID_IMDB, -1)
        getDetailMovie(id)
        setClickButtonPlay()
        clickBack()
    }

    private fun clickBack()
    {
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
            if (movie.status in arrayListOf("Released","Returning Series","Ended")) {
                startActivity<PlayMediaActivity>(
                    AppConstants.ID_IMDB to movie.id,
                    AppConstants.TYPE_MOVIE to AppConstants.IS_TYPE_MOVIE_TV,
                    AppConstants.SEASON to season,
                    AppConstants.EPISODE to episode
                )
            } else {
                Toast.makeText(
                    getContext(), "Phim này sẽ sớm ra mắt vào ngày - Không xác định", Toast.LENGTH_LONG
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
    private fun initSeason() {
        seasonAdapter = SeasonAdapter(getContext())
        seasonAdapter.onClickItem = this
        if(movie.seasons.isNotEmpty())
        {
            movie.seasons[0].isSelected = true
        }
        listSeason.addAll(movie.seasons)
        seasonAdapter.setData(listSeason)
        // Create recycleView
        AppUtils.initRecyclerViewVerticalWithFlexBoxLayout(binding.itemSeries.rvSeasons, seasonAdapter)
    }
    private fun initEpisode() {
        episodeAdapter = EpisodeAdapter(getContext())
        episodeAdapter.onClickItem = this
        listEpisode.clear()
        if(movie.seasons.isNotEmpty())
        {
            for(item in 1..movie.seasons[0].episodeCount)
            {
                val episode = Episode()
                episode.id = item
                listEpisode.add(episode)
            }
            seasonSelected = movie.seasons[0]
            listEpisode[0].isSelected = true
        }
        episodeAdapter.setData(listEpisode)
        // Create recycleView
        AppUtils.initRecyclerViewVerticalWithFlexBoxLayout(binding.itemSeries.rvEpisode, episodeAdapter)
    }

    private fun getDetailMovie(id: Int) {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB_TV)
            .api(GetDetailTVMovieAPI.params(id))
            .request(object : HttpCallbackProxy<ResponeTVMovie>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onHttpSuccess(result: ResponeTVMovie) {
                    movie = result
                    setDataForView()
                    initMovieTrailer()
                    initGenre()
                    initSeason()
                    initEpisode()
                }
            })
    }

    @SuppressLint("SetTextI18n", "DiscouragedApi")
    private fun setDataForView() {
        PhotoShowUtils.loadPhotoImageNormal(
            APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + movie.posterPath,
            binding.itemHead.imvPoster
        )
        binding.itemHead.tvTitle.text = movie.name
        if(movie.firstAirDate.isNotEmpty())
        {
            binding.itemHead.tvReleaseDate.text = DateUtils.formatDate(
                movie.firstAirDate
            )
        }else{
            binding.itemHead.tvReleaseDate.text =
                getString(getResources().getIdentifier("undefine", "string", getContext().packageName))
        }
        binding.itemHead.tvVoteCount.text = "${getString(getResources().getIdentifier("rate", "string", getContext().packageName))}: ${AppUtils.roundAndFormat(movie.voteAverage)}/10"
        binding.itemHead.tvSumVoteCount.text =
            "${getString(getResources().getIdentifier("number_of_rate", "string", getContext().packageName))}: ${AppUtils.getMoneyFormatted(movie.voteCount.toBigDecimal())}"
        binding.itemDetail.tvContent.text = movie.overview
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onClick(season: Season, position: Int) {
        seasonSelected = season
        listSeason.forEach { it.isSelected = false }
        listSeason[position].isSelected = true
        this.season = season.seasonNumber
        seasonAdapter.notifyDataSetChanged()
        resetEpisode()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onClick(episode: Episode, position: Int) {
        listEpisode.forEach { it.isSelected = false }
        listEpisode[position].isSelected = true
        this.episode = listEpisode[position].id
        episodeAdapter.notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun resetEpisode()
    {
        listEpisode.clear()
        for(item in 1..seasonSelected.episodeCount)
        {
            val episode = Episode()
            episode.id = item
            listEpisode.add(episode)
        }
        listEpisode[0].isSelected = true
        episodeAdapter.notifyDataSetChanged()
    }
}