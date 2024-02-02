package vn.xdeuhug.movieXD.ui.activity

import android.annotation.SuppressLint
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallbackProxy
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivityMediaPlayBinding
import vn.xdeuhug.movieXD.http.GetDetailMovieAPI
import vn.xdeuhug.movieXD.model.modelDetailMovie.ResponseDetailMovie
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
@Suppress("DEPRECATION")
class PlayMediaActivity : AppActivity() {
    private lateinit var binding: ActivityMediaPlayBinding
    override fun getLayoutView(): View {
        binding = ActivityMediaPlayBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        ViewCompat.setOnApplyWindowInsetsListener(
            binding.root
        ) { view: View, windowInsets: WindowInsetsCompat ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.layoutParams = (view.layoutParams as FrameLayout.LayoutParams).apply {
                // draw on top of the bottom navigation bar
                bottomMargin = insets.bottom
            }

            // Return CONSUMED if you don't want the window insets to keep being
            // passed down to descendant views.
            WindowInsetsCompat.CONSUMED
        }
        setWebView()
    }

    private fun setWebView() {
        binding.wvLoadVideo.webChromeClient = WebChromeClient()
        binding.wvLoadVideo.settings.loadsImagesAutomatically = true
        binding.wvLoadVideo.settings.javaScriptEnabled = true
        binding.wvLoadVideo.settings.allowFileAccess = true
        binding.wvLoadVideo.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        binding.wvLoadVideo.settings.javaScriptCanOpenWindowsAutomatically = true
        binding.wvLoadVideo.settings.pluginState = WebSettings.PluginState.ON
        binding.wvLoadVideo.settings.mediaPlaybackRequiresUserGesture = false
        binding.wvLoadVideo.settings.domStorageEnabled = true
        binding.wvLoadVideo.settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        binding.wvLoadVideo.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        binding.wvLoadVideo.requestFocus(View.FOCUS_DOWN)
        val id = intent.getStringExtra(AppConstants.ID_IMDB_STR)
        val html =
            "<iframe allowtransparency=\"true\" src=\"https://www.2embed.cc/embed/$id\" width=\"100%\" height=\"100%\" frameborder=\"0\" scrolling=\"no\" allowfullscreen></iframe>"
        binding.wvLoadVideo.loadData(html, "text/html", null)
    }

//    private fun getDetailMovie(id: Int) {
//        EasyHttp.get(this).server(APITheMovieDBRouter.HOST_THE_MOVIE_DB_MOVIE)
//            .api(GetDetailMovieAPI.params(id))
//            .request(object : HttpCallbackProxy<ResponseDetailMovie>(this) {
//                @SuppressLint("NotifyDataSetChanged")
//                override fun onHttpSuccess(result: ResponseDetailMovie) {
//                    val movieImdbId = result.imdbId
//                    val html =
//                        "<iframe allowtransparency=\"true\" src=\"https://www.2embed.cc/embed/$movieImdbId\" width=\"100%\" height=\"100%\" frameborder=\"0\" scrolling=\"no\" allowfullscreen></iframe>"
//                    binding.wvLoadVideo.loadData(html, "text/html", null)
//                }
//            })
//    }

    override fun initData() {
        //
    }
}