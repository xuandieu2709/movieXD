package vn.xdeuhug.movieXD.ui.activity

import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.annotation.RequiresApi
import vn.xdeuhug.movieXD.R
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.databinding.HomeActivityBinding
import kotlin.system.exitProcess

/**
 * @Author: Nguyễn Xuân Diệu
 * @Date: 12/01/2023
 */
class HomeActivity : AppActivity() {
    lateinit var binding: HomeActivityBinding
    private var twice = false
    // You can use this method to check if the activity is currently resumed or not
    override fun getLayoutView(): View {
        binding = HomeActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
    }

    @RequiresApi(33)
    override fun initView() {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (twice) {
                    exitProcess(0)
                }
                twice = true
                toast(getString(R.string.back_confirm))
                postDelayed({ twice = false }, 2000)
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun initData() {
        //
    }


}