package vn.xdeuhug.movieXD.http

import com.hjq.http.annotation.HttpRename
import vn.xdeuhug.movieXD.http.api.BaseApi
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.utils.LanguageUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 01 / 02 / 2024
 */
class SearchMovieAPI : BaseApi() {

    @HttpRename("language")
    var language = LanguageUtils.DEFAULT_EN

    @HttpRename("api_key")
    var apiKey = APITheMovieDBRouter.API_KEY

    @HttpRename("page")
    var page = 1

    @HttpRename("include_adult")
    var includeAdult = false

    @HttpRename("query")
    var keySearch = ""


    override fun getApi(): String {
        return APITheMovieDBRouter.API_SEARCH_MOVIE()
    }

    companion object {
        fun params(keySearch: String, page: Int): BaseApi {
            val data = SearchMovieAPI()
            data.keySearch = keySearch
            data.page = page
            return data
        }
    }
}