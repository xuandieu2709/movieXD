package vn.xdeuhug.movieXD.ui.activity

import android.text.InputType
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import com.paginate.Paginate
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.startActivity
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivitySearchMovieBinding
import vn.xdeuhug.movieXD.http.SearchMovieAPI
import vn.xdeuhug.movieXD.model.modelListMovie.Movie
import vn.xdeuhug.movieXD.model.modelListMovie.MovieResponse
import vn.xdeuhug.movieXD.other.CustomLoadingListItemCreator
import vn.xdeuhug.movieXD.other.doOnQueryTextListener
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.ui.adapter.MovieReviewAdapter
import vn.xdeuhug.movieXD.utils.AppUtils
import java.util.ArrayList

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 01 / 02 / 2024
 */
class SearchMovieActivity : AppActivity(), MovieReviewAdapter.OnClickItem {
    private lateinit var binding: ActivitySearchMovieBinding

    private lateinit var movieAdapter: MovieReviewAdapter
    private var listMovie: ArrayList<Movie> = ArrayList()
    private var loading = false
    private var currentPage = 1
    private var total = 0 // TOTAL RECORD
    private var lastPage = 0
    override fun getLayoutView(): View {
        binding = ActivitySearchMovieBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        initRecycleView()
        paginate()
        binding.svSearch.inputType = InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
        binding.svSearch.doOnQueryTextListener(1000) {
            currentPage = 1
            searchMovies(it, currentPage)
        }
    }

    override fun initData() {
        //
    }

    private fun initRecycleView() {
        // Trending
        movieAdapter = MovieReviewAdapter(getContext(), true)
        movieAdapter.onClickItem = this
        movieAdapter.setData(listMovie)
        AppUtils.initRecyclerViewVertical(
            binding.rvMovie, movieAdapter, 2
        )
    }

    private fun paginate() {
        val callback: Paginate.Callbacks = object : Paginate.Callbacks {
            override fun onLoadMore() {
                loading = true
                postDelayed({
                    if (currentPage < lastPage) {
                        currentPage += 1
                        searchMovies(binding.svSearch.query.toString(), currentPage)
                        loading = false
                    }
                }, 1000)
            }

            override fun isLoading(): Boolean {
                return loading
            }

            override fun hasLoadedAllItems(): Boolean {
                if (total < AppConstants.PAGE_SIZE) return true
                return currentPage == lastPage
            }

        }

        Paginate.with(binding.rvMovie, callback).setLoadingTriggerThreshold(0)
            .addLoadingListItem(true).setLoadingListItemCreator(CustomLoadingListItemCreator())
            .build()
    }

    private fun searchMovies(keySearch: String, page: Int) {
        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB)
            .api(SearchMovieAPI.params(keySearch, page))
            .request(object : HttpCallbackProxy<MovieResponse>(this) {
                override fun onHttpSuccess(result: MovieResponse) {
                    if (currentPage == 1) {
                        total = result.totalResults
                        lastPage = result.totalPages
                        listMovie.clear()
                    }
                    listMovie.addAll(result.results)
                    movieAdapter.notifyDataSetChanged()
                }
            })
    }

    override fun onClick(movie: Movie) {
        if(movie.knownFor.isNotEmpty())
        {
            if(movie.mediaType == "tv")
            {
                startActivity<DetailMovieTVActivity>(AppConstants.ID_IMDB to movie.knownFor[0].id)
            }else{
                startActivity<DetailMovieActivity>(AppConstants.ID_IMDB to movie.knownFor[0].id)
            }
        }else{
            if(movie.mediaType == "tv")
            {
                startActivity<DetailMovieTVActivity>(AppConstants.ID_IMDB to movie.id)
            }else{
                startActivity<DetailMovieActivity>(AppConstants.ID_IMDB to movie.id)
            }
        }

    }
}