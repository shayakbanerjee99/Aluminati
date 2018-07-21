package aakashresearchlabs.org.aluminati.activities

import aakashresearchlabs.org.aluminati.R
import aakashresearchlabs.org.aluminati.fragments.chatfragment.ChatFragment
import aakashresearchlabs.org.aluminati.fragments.fragmentAlumni.AlumniListFragment
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {

    private var viewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        viewPager = findViewById<ViewPager?>(R.id.view_pager)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager!!.adapter = adapter

        val tabLayout = findViewById<View>(R.id.tab_layout) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.profile_menu_item -> startProfileActivity(this)

        else -> super.onOptionsItemSelected(item)
    }

    private fun startProfileActivity(context: Context): Boolean {
        val intent = Intent(context, ProfileActivity::class.java)
        startActivity(intent)
        return true
    }
}

private class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    companion object {
        const val PAGE_COUNT = 2
    }

    override fun getCount(): Int {
        return PAGE_COUNT
    }

    override fun getItem(position: Int): Fragment = when(position) {
        0 -> AlumniListFragment.newInstance()
        1 -> ChatFragment.newInstance()

        else -> AlumniListFragment.newInstance()
    }

    override fun getPageTitle(position: Int): CharSequence = when(position) {
        0 -> "Alumni"
        1 -> "Chats"

        else -> "Alumni"
    }
}