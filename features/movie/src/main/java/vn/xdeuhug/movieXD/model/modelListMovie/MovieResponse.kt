package vn.xdeuhug.movieXD.model.modelListMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class MovieResponse {
    var page = 0
    var results = ArrayList<Movie>()

    @SerializedName("total_pages")
    @HttpRename("total_pages")
    var totalPages = 0

    @SerializedName("total_results")
    @HttpRename("total_results")
    var totalResults = 0
}