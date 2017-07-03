package com.cleanarchitecture.presentation.detail

import android.support.v7.app.AppCompatActivity
import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.presentation.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        inizializeSearchComponent()
    }

    fun inizializeSearchComponent() {
        val detailView = (view_detail as DetailView)

        val detailRouter = DetailRouter(this)
        val detailInteractor = UserInteractor()
        val detailPresenter = DetailPresenter(detailView, detailRouter, detailInteractor)
        detailView.presenter = detailPresenter

        detailPresenter!!.onRetrieveUser("elabi3")
    }

}