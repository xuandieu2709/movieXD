package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class Result {
    var id: String = ""

    @SerializedName("iso_3166_1")
    @HttpRename("iso_3166_1")
    var iso31661: String = ""

    @SerializedName("iso_639_1")
    @HttpRename("iso_639_1")
    var iso6391: String = ""
    var key: String = ""
    var name: String = ""
    var official: Boolean = false

    @SerializedName("published_at")
    @HttpRename("published_at")
    var publishedAt: String = ""
    var site: String = ""
    var size: Int = 0
    var type: String = ""
}