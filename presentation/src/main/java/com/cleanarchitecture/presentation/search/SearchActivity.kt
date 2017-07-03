package com.cleanarchitecture.presentation.search

import android.support.v7.app.AppCompatActivity
import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.presentation.R
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        inizializeSearchComponent()
    }

    fun inizializeSearchComponent() {
        val searchView = (view_search as SearchView)

        val searchRouter = SearchRouter(this)
        val searchInteractor = UserInteractor()
        val searchPresenter = SearchPresenter(searchView, searchRouter, searchInteractor)
        searchView.presenter = searchPresenter
    }

}
