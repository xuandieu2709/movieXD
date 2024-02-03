package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class LastEpisodeToAir {
    @SerializedName("air_date")
    @HttpRename("air_date")
    var airDate: String = ""

    @SerializedName("episode_number")
    @HttpRename("episode_number")
    var episodeNumber: Int = 0

    @SerializedName("episode_type")
    @HttpRename("episode_type")
    var episodeType: String = ""
    var id: Int = 0
    var name: String = ""
    var overview: String = ""

    @SerializedName("production_code")
    @HttpRename("production_code")
    var productionCode: String = ""
    var runtime: Int = 0

    @SerializedName("season_number")
    @HttpRename("season_number")
    var seasonNumber: Int = 0

    @SerializedName("show_id")
    @HttpRename("show_id")
    var showId: Int = 0

    @SerializedName("still_path")
    @HttpRename("still_path")
    var stillPath: Any = Any()

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    @SerializedName("vote_count")
    @HttpRename("vote_count")
    var voteCount: Int = 0
}