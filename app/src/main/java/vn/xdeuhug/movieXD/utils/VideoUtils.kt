package vn.xdeuhug.movieXD.utils

import cn.jzvd.JZDataSource
import cn.jzvd.Jzvd
import cn.jzvd.JzvdStd
import cn.jzvd.JzvdStdTikTok
import vn.xdeuhug.movieXD.utils.AppUtils.show
import vn.xdeuhug.seniorsociable.utils.PhotoShowUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
object VideoUtils {
    fun loadVideo(link: String, zVideo: JzvdStd) {
//        val proxy: HttpProxyCacheServer = app.getProxy(app)!!
//        val proxyUrl = proxy.getProxyUrl(video.link)
        PhotoShowUtils.loadPhotoImageNormal(
            link, zVideo.posterImageView
        )
        val jzDataSource = JZDataSource(
            link, ""
        )
        jzDataSource.looping = true
        zVideo.setUp(jzDataSource, Jzvd.SCREEN_NORMAL)
        zVideo.startVideoAfterPreloading()
//        zVideo.bottomProgressBar.show()
    }
}