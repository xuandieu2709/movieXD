package vn.xdeuhug.movieXD.http

import com.hjq.http.annotation.HttpRename
import vn.xdeuhug.movieXD.http.api.BaseApi
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.utils.LanguageUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
class GetMoviePopularAPI : BaseApi() {

    @HttpRename("language")
    var language = LanguageUtils.DEFAULT_EN

    @HttpRename("api_key")
    var apiKey = APITheMovieDBRouter.API_KEY


    override fun getApi(): String {
        return APITheMovieDBRouter.API_POPULAR()
    }
}