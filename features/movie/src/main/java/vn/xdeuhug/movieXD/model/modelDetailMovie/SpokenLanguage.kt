package vn.xdeuhug.movieXD.model.modelDetailMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class SpokenLanguage {
    @SerializedName("english_name")
    @HttpRename("english_name")
    var englishName: String = ""

    @SerializedName("iso_639_1")
    @HttpRename("iso_639_1")
    var iso6391: String = ""
    var name: String = ""
}