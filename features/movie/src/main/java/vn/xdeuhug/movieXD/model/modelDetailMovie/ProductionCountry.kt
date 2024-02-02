package vn.xdeuhug.movieXD.model.modelDetailMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class ProductionCountry{
    @SerializedName("iso_3166_1")
    @HttpRename("iso_3166_1")
    var iso31661: String = ""
    var name: String = ""
}