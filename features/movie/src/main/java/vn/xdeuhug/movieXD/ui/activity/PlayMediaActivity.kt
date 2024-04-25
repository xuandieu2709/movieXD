package vn.xdeuhug.movieXD.ui.activity

import android.annotation.SuppressLint
import android.net.ConnectivityManager
import android.view.KeyEvent
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.gson.GsonBuilder
import com.monstertechno.adblocker.AdBlockerWebView
import com.monstertechno.adblocker.util.AdBlocker
import timber.log.Timber
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.constants.AppConstants
import vn.xdeuhug.movieXD.databinding.ActivityMediaPlayBinding
import vn.xdeuhug.movieXD.router.API2EmbedRouter
import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.LinkedList





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
        AdBlockerWebView.init(this).initializeWebView(binding.wvLoadVideo)
        setupFullscreenMode()
        readAdServers()
//        setWebView()
        setWebViewWithADsBlock()
    }

    private var src = ""

    @SuppressLint("SetJavaScriptEnabled")
    private fun setWebViewWithADsBlock() {
        binding.wvLoadVideo.webViewClient = AdsBlockWebViewClient()
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
        val type = intent.getIntExtra(AppConstants.TYPE_MOVIE, -1)
        when (type) {
            AppConstants.IS_TYPE_MOVIE -> {
                val id = intent.getStringExtra(AppConstants.ID_IMDB_STR)
                src = "${API2EmbedRouter.SERVER_2EMBED_EMBED}$id"
            }

            AppConstants.IS_TYPE_MOVIE_TV -> {
                val id = intent.getIntExtra(AppConstants.ID_IMDB, -1)
                val season = intent.getIntExtra(AppConstants.SEASON, 0)
                val episode = intent.getIntExtra(AppConstants.EPISODE, 0)
                src = "${API2EmbedRouter.SERVER_2EMBED_TV_EMBED}$id&s=$season&e=$episode"
            }
        }
        Timber.tag("LOG SRC").i(src)
        val html =
            "<html><body style='margin:0;padding:0;'><iframe width=\"100%\" height=\"100%\" src=\"$src\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>"
        binding.wvLoadVideo.loadData(html, "text/html", null)
//        binding.wvLoadVideo.loadUrl("javascript:document.getElementsByClassName('playbtnx').style.display = 'none';")
        val webSettings = binding.wvLoadVideo.settings
        //
        val cm = this.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val ani = cm.activeNetworkInfo
        if (ani != null && ani.isConnected) webSettings.cacheMode = WebSettings.LOAD_DEFAULT
        else webSettings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        webSettings.setSupportZoom(true)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false
        webSettings.loadWithOverviewMode = true
        webSettings.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS
        webSettings.domStorageEnabled = true
        webSettings.allowFileAccess = true
        webSettings.javaScriptEnabled = true  // Enable this only if you need JavaScript support!
        webSettings.javaScriptCanOpenWindowsAutomatically =
            false       // Enable this only if you want pop-ups!
        webSettings.mediaPlaybackRequiresUserGesture = true
        binding.srlRefresh.setOnRefreshListener {
//            binding.wvLoadVideo.reload()
            val html =
            "<html><body style='margin:0;padding:0;'><iframe width=\"100%\" height=\"100%\" src=\"$src\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>"
            binding.wvLoadVideo.loadData(html, "text/html", null)
            postDelayed({
                binding.srlRefresh.finishRefresh()
            }, 2000)
        }
    }

    private fun setupFullscreenMode() {
        val decorView = setFullscreen()
        decorView.setOnSystemUiVisibilityChangeListener { setFullscreen() }
    }

    private fun setFullscreen(): View {
        val decorView = window.decorView
        decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        return decorView
    }

    @SuppressLint("SetJavaScriptEnabled")
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
        val type = intent.getIntExtra(AppConstants.TYPE_MOVIE, -1)
        var src = ""
        when (type) {
            AppConstants.IS_TYPE_MOVIE -> {
                val id = intent.getStringExtra(AppConstants.ID_IMDB_STR)
                src = "${API2EmbedRouter.SERVER_2EMBED_EMBED}$id"
            }

            AppConstants.IS_TYPE_MOVIE_TV -> {
                val id = intent.getIntExtra(AppConstants.ID_IMDB, -1)
                val season = intent.getIntExtra(AppConstants.SEASON, 0)
                val episode = intent.getIntExtra(AppConstants.EPISODE, 0)
                src = "${API2EmbedRouter.SERVER_2EMBED_TV_EMBED}$id&s=$season&e=$episode"
            }
        }
        Timber.tag("LOG SRC").i(src)
        val html =
            "<html><body style='margin:0;padding:0;'><iframe width=\"100%\" height=\"100%\" src=\"$src\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>"
        binding.wvLoadVideo.loadData(html, "text/html", null)
        binding.wvLoadVideo.loadUrl("javascript:document.getElementsByClassName('playbtnx').style.display = 'none';")
        val webSettings = binding.wvLoadVideo.settings
        //
        val cm = this.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val ani = cm.activeNetworkInfo
        if (ani != null && ani.isConnected) webSettings.cacheMode = WebSettings.LOAD_DEFAULT
        else webSettings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        webSettings.setSupportZoom(true)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false
        webSettings.loadWithOverviewMode = true
        webSettings.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS
        webSettings.domStorageEnabled = true
        webSettings.allowFileAccess = true
        webSettings.javaScriptEnabled = true  // Enable this only if you need JavaScript support!
        webSettings.javaScriptCanOpenWindowsAutomatically =
            false       // Enable this only if you want pop-ups!
        webSettings.mediaPlaybackRequiresUserGesture = true
        binding.srlRefresh.setOnRefreshListener {
            binding.wvLoadVideo.reload()
            postDelayed({
                binding.srlRefresh.finishRefresh()
            }, 2000)
        }
    }

    private lateinit var adservers: StringBuilder

    @SuppressLint("DiscouragedApi")
    private fun readAdServers() {
        adservers = StringBuilder()

        var line: String?
        val inputStream: InputStream = resources.openRawResource(
            resources.getIdentifier(
                "ad_block", "raw", packageName
            )
        )
        val br = BufferedReader(InputStreamReader(inputStream))

        try {
            while (br.readLine().also { line = it } != null) {
                adservers.append(line)
                adservers.append("\n")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    //Advertise filter with the lists
    inner class MyWebViewClient : WebViewClient() {
        override fun shouldInterceptRequest(
            view: WebView, request: WebResourceRequest
        ): WebResourceResponse? {
            val empty = ByteArrayInputStream("".toByteArray())
            val kk5 = adservers.toString()

            if (kk5.contains(":::::" + request.url.host)) return WebResourceResponse(
                "text/plain", "utf-8", empty
            )

            return super.shouldInterceptRequest(view, request)
        }
    }

    inner class AdsBlockWebViewClient : WebViewClient() {

        override fun shouldInterceptRequest(
            view: WebView?,
            request: WebResourceRequest?
        ): WebResourceResponse? {
            return if (AdBlockerWebView.blockAds(
                    view,
                    request?.url.toString()
                )
            ) {
                AdBlocker.createEmptyResource()
            } else {
                super.shouldInterceptRequest(view, request?.url.toString())
            }
//            return super.shouldInterceptRequest(view, request?.url.toString())
        }

        override fun onUnhandledKeyEvent(view: WebView?, event: KeyEvent?) {
            if ((event?.keyCode == KeyEvent.KEYCODE_BACK) && view!!.canGoBack()) {
                view.goBack()
            }
            super.onUnhandledKeyEvent(view, event)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            if (!navigationHistory.contains(url)) // Check for duplicate urls
                navigationHistory.add(url?:"") // add each loading url to List
            toast(GsonBuilder().setPrettyPrinting().create().toJson(navigationHistory))
            super.onPageFinished(view, url)
        }

    }

    override fun initData() {
        //
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (navigationHistory.isNotEmpty()) // Check if the url is empty
        {
            navigationHistory.removeLast(); // Remove the last url

            if (navigationHistory.isNotEmpty()) {
                // Load the last page
                binding.wvLoadVideo.loadUrl(navigationHistory.getLast())
            } else {
                super.onBackPressed()
            }
        } else {
            super.onBackPressed()
        }
    }

    private var navigationHistory = LinkedList<String>()
}