package vn.xdeuhug.movieXD.model.modelListMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class Movie {
    var adult: Boolean = false

    @SerializedName("backdrop_path")
    @HttpRename("backdrop_path")
    var backdropPath = ""

    @SerializedName("first_air_date")
    @HttpRename("first_air_date")
    var firstAirDate = ""

    @SerializedName("genre_ids")
    @HttpRename("genre_ids")
    var genreIds  = ArrayList<Int>()
    var id: Int = 0

    @SerializedName("media_type")
    @HttpRename("media_type")
    var mediaType = ""
    var name = ""

    @SerializedName("origin_country")
    @HttpRename("origin_country")
    var originCountry = ArrayList<String>()

    @SerializedName("original_language")
    @HttpRename("original_language")
    var originalLanguage = ""

    @SerializedName("original_name")
    @HttpRename("original_name")
    var originalName = ""

    @SerializedName("original_title")
    @HttpRename("original_title")
    var originalTitle = ""
    var overview = ""
    var popularity = 0.00

    @SerializedName("poster_path")
    @HttpRename("poster_path")
    var posterPath = ""

    @SerializedName("release_date")
    @HttpRename("release_date")
    var releaseDate = ""
    var title = ""
    var video: Boolean = false

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage = 0.00

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount = 0
}