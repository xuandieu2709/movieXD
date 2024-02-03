package vn.xdeuhug.movieXD.model.modelTVMovie


import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename

class CreatedBy {
    @SerializedName("credit_id")
    @HttpRename("credit_id")
    var creditId: String = ""
    var gender: Int = 0
    var id: Int = 0
    var name: String = ""

    @SerializedName("profile_path")
    @HttpRename("profile_path")
    var profilePath: Any = Any()
}