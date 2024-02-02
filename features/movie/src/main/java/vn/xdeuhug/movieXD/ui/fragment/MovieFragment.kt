package vn.xdeuhug.movieXD.ui.fragment

import android.annotation.SuppressLint
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import org.jetbrains.anko.support.v4.startActivity
import vn.xdeuhug.movieXD.app.AppFragment
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.FragmentMovieBinding
import vn.xdeuhug.movieXD.http.GetMoviePopularAPI
import vn.xdeuhug.movieXD.http.GetTrendingAPI
import vn.xdeuhug.movieXD.model.modelListMovie.Movie
import vn.xdeuhug.movieXD.model.modelListMovie.MovieResponse
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.ui.activity.DetailMovieActivity
import vn.xdeuhug.movieXD.ui.activity.HomeActivity
import vn.xdeuhug.movieXD.ui.activity.PlayMediaActivity
import vn.xdeuhug.movieXD.ui.activity.SearchMovieActivity
import vn.xdeuhug.movieXD.ui.adapter.MovieReviewAdapter
import vn.xdeuhug.movieXD.utils.AppUtils
import java.util.ArrayList

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
class MovieFragment : AppFragment<HomeActivity>(), MovieReviewAdapter.OnClickItem {
    private lateinit var binding: FragmentMovieBinding

    // Trending
    private lateinit var movieReviewTrendingAdapter: MovieReviewAdapter
    private var listReviewMovieTrending = ArrayList<Movie>()

    // Popular
    private lateinit var movieReviewPopularAdapter: MovieReviewAdapter
    private var listReviewMoviePopular = ArrayList<Movie>()

    override fun getLayoutView(): View {
        binding = FragmentMovieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {
        initRecycleView()
        setViewData()
        getDataMovie()
        getDataTrending()
        setClickSearch()
    }

    private fun setClickSearch() {
        binding.tbTitle.rightView.clickWithDebounce {
            startActivity<SearchMovieActivity>()
        }
    }

    private fun getDataMovie() {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB_MOVIE)
            .api(GetMoviePopularAPI()).request(object : HttpCallbackProxy<MovieResponse>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onHttpSuccess(result: MovieResponse) {
                    val listData = result.results
                    listReviewMoviePopular.clear()
                    listReviewMoviePopular.addAll(listData)
                    movieReviewPopularAdapter.notifyDataSetChanged()
                }
            })
    }

    private fun getDataTrending() {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB).api(GetTrendingAPI())
            .request(object : HttpCallbackProxy<MovieResponse>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onHttpSuccess(result: MovieResponse) {
                    val listData = result.results
                    listReviewMovieTrending.clear()
                    listReviewMovieTrending.addAll(listData)
                    movieReviewTrendingAdapter.notifyDataSetChanged()
                }
            })
    }

    private fun setViewData() {
        binding.itemPopular.tvTitle.text = "Phổ biến"
        binding.itemTrending.tvTitle.text = "Trending"
    }

    private fun initRecycleView() {
        // Trending
        movieReviewTrendingAdapter = MovieReviewAdapter(requireContext())
        movieReviewTrendingAdapter.onClickItem = this
        movieReviewTrendingAdapter.setData(listReviewMovieTrending)
        AppUtils.initRecyclerViewHorizontal(
            binding.itemTrending.rvMovie, movieReviewTrendingAdapter
        )

        // Popular
        movieReviewPopularAdapter = MovieReviewAdapter(requireContext())
        movieReviewPopularAdapter.onClickItem = this
        movieReviewPopularAdapter.setData(listReviewMoviePopular)
        AppUtils.initRecyclerViewHorizontal(binding.itemPopular.rvMovie, movieReviewPopularAdapter)
    }

    override fun onClick(movie: Movie) {
        startActivity<DetailMovieActivity>(AppConstants.ID_IMDB to movie.id)
    }
}