package aakashresearchlabs.org.aluminati

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar
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

}
