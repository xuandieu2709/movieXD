package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename
import vn.xdeuhug.movieXD.model.modelDetailMovie.Genre

class ResponeTVMovie {

    var adult: Boolean = false

    @SerializedName("backdrop_path")
    @HttpRename("backdrop_path")
    var backdropPath: String = ""

    @SerializedName("created_by")
    @HttpRename("created_by")
    var createdBy = ArrayList<CreatedBy>()

    @SerializedName("episode_run_time")
    @HttpRename("episode_run_time")
    var episodeRunTime = ArrayList<Int>()

    @SerializedName("first_air_date")
    @HttpRename("first_air_date")
    var firstAirDate: String = ""
    var genres = ArrayList<Genre>()
    var homepage: String = ""
    var id: Int = 0

    @SerializedName("in_production")
    @HttpRename("in_production")
    var inProduction: Boolean = false
    var languages = ArrayList<String>()

    @SerializedName("last_air_date")
    @HttpRename("last_air_date")
    var lastAirDate: String = ""

    @SerializedName("last_episode_to_air")
    @HttpRename("last_episode_to_air")
    var lastEpisodeToAir: LastEpisodeToAir = LastEpisodeToAir()
    var name: String = ""
    var networks = ArrayList<Network>()

    @SerializedName("next_episode_to_air")
    @HttpRename("next_episode_to_air")
    var nextEpisodeToAir: Any = Any()

    @SerializedName("number_of_episodes")
    @HttpRename("number_of_episodes")
    var numberOfEpisodes: Int = 0

    @SerializedName("number_of_seasons")
    @HttpRename("number_of_seasons")
    var numberOfSeasons: Int = 0

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

    @SerializedName("production_companies")
    @HttpRename("production_companies")
    var productionCompanies = ArrayList<ProductionCompany>()

    @SerializedName("production_countries")
    @HttpRename("production_countries")
    var productionCountries = ArrayList<ProductionCountry>()
    var seasons = ArrayList<Season>()

    @SerializedName("spoken_languages")
    @HttpRename("spoken_languages")
    var spokenLanguages = ArrayList<SpokenLanguage>()
    var status: String = ""
    var tagline: String = ""
    var type: String = ""
    var videos: Videos = Videos()

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount: Int = 0
}