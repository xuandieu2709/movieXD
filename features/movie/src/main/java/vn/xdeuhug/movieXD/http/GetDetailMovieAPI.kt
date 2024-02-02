package vn.xdeuhug.movieXD.http

import com.hjq.http.annotation.HttpRename
import vn.xdeuhug.movieXD.http.api.BaseApi
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.utils.LanguageUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
class GetDetailMovieAPI : BaseApi() {
    @HttpRename("language")
    var language = LanguageUtils.DEFAULT_EN

    @HttpRename("api_key")
    var apiKey = APITheMovieDBRouter.API_KEY

    @HttpRename("append_to_response")
    var appendToResponse = "videos"

    @HttpRename("id")
    var id = 0


    override fun getApi(): String {
        return APITheMovieDBRouter.API_VIDEO(id)
    }

    companion object {
        fun params(id: Int): BaseApi {
            val data = GetDetailMovieAPI()
            data.id = id
            return data
        }
    }
}