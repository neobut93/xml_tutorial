package com.kodeco.xml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addToList()

        val viewPager = findViewById<ViewPager2>(R.id.view_pager2)
        viewPager.adapter = ViewPagerAdapter(titlesList, descList, imagesList)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager)
    }

    private fun addToList() {
        titlesList.add("Text1")
        titlesList.add("Text2")
        titlesList.add("Text3")
        titlesList.add("Text4")
        descList.add("Desc1")
        descList.add("Desc2")
        descList.add("Desc3")
        descList.add("Desc4")
        imagesList.add(R.drawable.image1)
        imagesList.add(R.drawable.image2)
        imagesList.add(R.drawable.image3)
        imagesList.add(R.drawable.image4)
    }
}