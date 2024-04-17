package vn.xdeuhug.movieXD.ui.activity

import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import vn.xdeuhug.base.PagerAdapter
import vn.xdeuhug.movieXD.R
import vn.xdeuhug.movieXD.app.AppActivity
import vn.xdeuhug.movieXD.app.AppFragment
import vn.xdeuhug.movieXD.constants.ModuleClassConstants
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
        setUpBottomBar()
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

    private fun setUpBottomBar()
    {
        val fragments: List<Fragment>
        fragments = listOf(
            Class.forName(ModuleClassConstants.MOVIE_FRAGMENT).newInstance() as AppFragment<*>,
            Class.forName(ModuleClassConstants.MOVIE_FRAGMENT).newInstance() as AppFragment<*>,
            Class.forName(ModuleClassConstants.MOVIE_FRAGMENT).newInstance() as AppFragment<*>
        )


        val adapter = PagerAdapter(this, fragments)

        //Setup menu
        binding.contentView.adapter = adapter
        binding.contentView.offscreenPageLimit = adapter.itemCount - 1
        binding.contentView.setCurrentItem(1, false)

        //Chặn viewpager2 vuốt
        binding.contentView.isUserInputEnabled = false
        binding.mBottomNavigationView.setItemSelected(R.id.itemMovie,true)
        binding.mBottomNavigationView.setOnItemSelectedListener {
            // Thay đổi
        }
    }

}