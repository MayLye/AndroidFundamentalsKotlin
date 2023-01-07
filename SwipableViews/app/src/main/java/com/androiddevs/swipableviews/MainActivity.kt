package com.androiddevs.swipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.kermit1,
            R.drawable.kermit2,
            R.drawable.kermit3
        )

        // to make it swipe, we need ViewPager
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        // use this line below to swipe vertically. Otherwise it will swipe horizontally as usual.
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()
    }
}