package vn.xdeuhug.movieXD.model.modelListMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename
import java.util.ArrayList

class Movie {
    var adult: Boolean = false

    @SerializedName("backdrop_path")
    @HttpRename("backdrop_path")
    var backdropPath: String = ""

    @SerializedName("first_air_date")
    @HttpRename("first_air_date")
    var firstAirDate: String = ""
    var gender: Int = 0

    @SerializedName("genre_ids")
    @HttpRename("genre_ids")
    var genreIds = ArrayList<Int>()
    var id: Int = 0

    @SerializedName("known_for")
    @HttpRename("known_for")
    var knownFor = ArrayList<KnownFor>()

    @SerializedName("known_for_department")
    @HttpRename("known_for_department")
    var knownForDepartment: String = ""

    @SerializedName("media_type")
    @HttpRename("media_type")
    var mediaType: String = ""
    var name: String = ""

    @SerializedName("origin_country")
    @HttpRename("origin_country")
    var originCountry = ArrayList<String>()

    @SerializedName("original_language")
    @HttpRename("original_language")
    var originalLanguage: String = ""

    @SerializedName("original_name")
    @HttpRename("original_name")
    var originalName: String = ""
    var overview: String = ""
    var popularity: Double = 0.0

    @SerializedName("poster_path")
    @HttpRename("poster_path")
    var posterPath: String = ""

    @SerializedName("profile_path")
    @HttpRename("profile_path")
    var profilePath: Any = Any()

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount: Int = 0

    var title = ""
}