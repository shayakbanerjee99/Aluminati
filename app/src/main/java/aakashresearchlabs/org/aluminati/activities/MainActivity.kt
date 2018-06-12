package aakashresearchlabs.org.aluminati.activities

import aakashresearchlabs.org.aluminati.R
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar
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
