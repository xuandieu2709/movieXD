package vn.xdeuhug.movieXD.ui.activity

import android.annotation.SuppressLint
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.startActivity
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivityDetailMovieBinding
import vn.xdeuhug.movieXD.http.GetDetailMovieAPI
import vn.xdeuhug.movieXD.model.modelDetailMovie.ResponseDetailMovie
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.utils.AppUtils
import vn.xdeuhug.seniorsociable.utils.PhotoShowUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
class DetailMovieActivity : AppActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var movie: ResponseDetailMovie

    override fun getLayoutView(): View {
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        val id = intent.getIntExtra(AppConstants.ID_IMDB, -1)
        getDetailMovie(id)
        setClickButtonPlay()
    }

    private fun setClickButtonPlay() {
        binding.itemDetail.llPlay.clickWithDebounce {
            startActivity<PlayMediaActivity>(AppConstants.ID_IMDB_STR to movie.imdbId)
        }
    }

    override fun initData() {
        //
    }

    private fun getDetailMovie(id: Int) {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB_MOVIE)
            .api(GetDetailMovieAPI.params(id))
            .request(object : HttpCallbackProxy<ResponseDetailMovie>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onHttpSuccess(result: ResponseDetailMovie) {
                    movie = result
                    setDataForView()
                }
            })
    }

    @SuppressLint("SetTextI18n")
    private fun setDataForView() {
        PhotoShowUtils.loadPhotoImageNormal(
            APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + movie.backdropPath,
            binding.itemHead.imvPoster
        )
        binding.itemHead.tvTitle.text = movie.originalTitle
        binding.itemHead.tvReleaseDate.text = movie.releaseDate
        binding.itemHead.tvVoteCount.text = "Đánh giá: ${movie.voteAverage}/10"
        binding.itemHead.tvSumVoteCount.text = "Số lượng đánh giá: ${AppUtils.getMoneyFormatted(movie.voteCount.toBigDecimal())}"
        binding.itemDetail.tvContent.text = movie.overview
    }
}