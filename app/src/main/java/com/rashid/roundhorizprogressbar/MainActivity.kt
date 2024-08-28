package com.rashid.roundhorizprogressbar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.rashid.roundhorizontalprogressbar.RoundedHorizontalProgressBar


class MainActivity : AppCompatActivity() {
    private var mRoundedHorizontalProgressBar1: RoundedHorizontalProgressBar? = null
    private var mRoundedHorizontalProgressBar2: RoundedHorizontalProgressBar? = null
    private var mRoundedHorizontalProgressBar4: RoundedHorizontalProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRoundedHorizontalProgressBar1 =
            findViewById<View>(R.id.progress_bar_1) as RoundedHorizontalProgressBar
        mRoundedHorizontalProgressBar2 =
            findViewById<View>(R.id.progress_bar_2) as RoundedHorizontalProgressBar
        mRoundedHorizontalProgressBar4 =
            findViewById<View>(R.id.progress_bar_4) as RoundedHorizontalProgressBar
        mRoundedHorizontalProgressBar1!!.animateProgress(2000, 0, 80)
        mRoundedHorizontalProgressBar2!!.setProgressColors(
            ResourcesCompat.getColor(
                getResources(),
                R.color.blue_light,
                null
            ), ResourcesCompat.getColor(getResources(), R.color.blue, null)
        )
        mRoundedHorizontalProgressBar2!!.animateProgress(1000, 0, 60)
        mRoundedHorizontalProgressBar4!!.animateProgress(1000, 0, 40)
    }
}

