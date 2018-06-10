package aakashresearchlabs.org.aluminati

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    companion object {
        const val PAGE_COUNT = 1
    }

    override fun getCount(): Int {
        Log.d("aluminati", "getcount called")
        return PAGE_COUNT
    }

    override fun getItem(position: Int): Fragment = when(position) {
        0 -> AlumniListFragment.newInstance()

        else -> AlumniListFragment.newInstance()
    }

    override fun getPageTitle(position: Int): CharSequence = when(position) {
        0 -> "Alumni"

        else -> "Alumni"
    }
}