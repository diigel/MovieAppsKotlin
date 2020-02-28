package com.dhani.movieapps.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dhani.movieapps.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailTvShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initView()
    }

    private fun initView(){
        toobar_detail.setNavigationOnClickListener { onBackPressed() }
        toobar_detail.title = "Detail Tv Show"
    }
}
