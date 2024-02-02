package vn.xdeuhug.movieXD.model.modelDetailMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class ResponseDetailMovie {
    var adult: Boolean = false

    @SerializedName("backdrop_path")
    @HttpRename("backdrop_path")
    var backdropPath: String = ""

    @SerializedName("belongs_to_collection")
    @HttpRename("belongs_to_collection")
    var belongsToCollection: Any = Any()
    var budget: Int = 0
    var genres = ArrayList<Genre>()
    var homepage: String = ""
    var id: Int = 0

    @SerializedName("imdb_id")
    @HttpRename("imdb_id")
    var imdbId: String = ""

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

    @SerializedName("production_companies")
    @HttpRename("production_companies")
    var productionCompanies = ArrayList<ProductionCompany>()

    @SerializedName("production_countries")
    @HttpRename("production_countries")
    var productionCountries = ArrayList<ProductionCountry>()

    @SerializedName("release_date")
    @HttpRename("release_date")
    var releaseDate: String = ""
    var revenue: Int = 0
    var runtime: Int = 0

    @SerializedName("spoken_languages")
    @HttpRename("spoken_languages")
    var spokenLanguages = ArrayList<SpokenLanguage>()
    var status: String = ""
    var tagline: String = ""
    var title: String = ""
    var video: Boolean = false
    var videos: Videos = Videos()

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount: Int = 0
}