package com.dhani.movieapps.ui.detail

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.dhani.movieapps.BuildConfig
import com.dhani.movieapps.R
import com.dhani.movieapps.network.response.DetailMovie
import com.dhani.movieapps.utils.NetworkState
import com.dhani.movieapps.utils.Status
import com.dhani.movieapps.viewModel.DetailMovieViewModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailMovieActivity : AppCompatActivity() {
    private val viewModel: DetailMovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initModel()
    }

    private fun getValue() = intent?.getIntExtra("id",0)


    private fun initView(detailMovie: DetailMovie) {
        toobar_detail.setNavigationIcon(R.drawable.ic_back_white)
        toobar_detail.setNavigationOnClickListener { onBackPressed() }
        toobar_detail.title = "Detail Movie"
        toobar_detail.setTitleTextColor(Color.WHITE)
        Glide.with(this).load(BuildConfig.IMG_URL + detailMovie.posterPath).into(img_poster_detail)

    }

    private fun initModel() {
        viewModel.getDetailMovie(getValue()).observe(this, Observer {
            initView(it)
        })
        viewModel.getLoaded().observe(this, Observer {
            if (it.status == Status.RUNNING){

            }
        })
    }

}
