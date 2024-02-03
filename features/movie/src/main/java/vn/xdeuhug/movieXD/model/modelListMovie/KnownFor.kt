package vn.xdeuhug.movieXD.model.modelListMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename
import java.util.ArrayList

class KnownFor {
    var adult: Boolean = false

    @SerializedName("backdrop_path")
    @HttpRename("backdrop_path")
    var backdropPath: Any = Any()

    @SerializedName("genre_ids")
    @HttpRename("genre_ids")
    var genreIds = ArrayList<Int>()
    var id: Int = 0

    @SerializedName("media_type")
    @HttpRename("media_type")
    var mediaType: String = ""

    @SerializedName("original_language")
    @HttpRename("original_language")
    var originalLanguage: String = ""

    @SerializedName("original_title")
    @HttpRename("original_title")
    var originalTitle: String = ""
    var overview: String = ""
    var popularity: Double = 0.0

    @SerializedName("poster_path")
    @HttpRename("poster_path")
    var posterPath: String = ""

    @SerializedName("release_date")
    @HttpRename("release_date")
    var releaseDate: String = ""
    var title: String = ""
    var video: Boolean = false

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount: Int = 0

}