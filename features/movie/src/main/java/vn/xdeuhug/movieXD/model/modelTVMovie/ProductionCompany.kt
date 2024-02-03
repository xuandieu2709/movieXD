package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class ProductionCompany {
    var id: Int = 0

    @SerializedName("logo_path")
    @HttpRename("logo_path")
    var logoPath: String = ""
    var name: String = ""

    @SerializedName("origin_country")
    @HttpRename("origin_country")
    var originCountry: String = ""
}