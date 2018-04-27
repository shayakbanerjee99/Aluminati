package aakashresearchlabs.org.aluminati

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.setupViewPager()
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }

}
