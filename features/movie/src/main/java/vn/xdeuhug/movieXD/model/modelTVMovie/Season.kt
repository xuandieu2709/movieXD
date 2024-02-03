package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class Season {
    @SerializedName("air_date")
    @HttpRename("air_date")
    var airDate: String = ""

    @SerializedName("episode_count")
    @HttpRename("episode_count")
    var episodeCount: Int = 0
    var id: Int = 0
    var name: String = ""
    var overview: String = ""

    @SerializedName("poster_path")
    @HttpRename("poster_path")
    var posterPath: String = ""

    @SerializedName("season_number")
    @HttpRename("season_number")
    var seasonNumber: Int = 0

    @SerializedName("vote_average")
    @HttpRename("vote_average")
    var voteAverage: Double = 0.0

    var isSelected = false
}