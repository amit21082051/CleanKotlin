package com.cleanarchitecture.presentation.search

import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.presentation.base.IPresenter
import com.cleanarchitecture.presentation.base.IRouter
import com.cleanarchitecture.presentation.base.IView

interface SearchContract {

    interface View : IView<Presenter> {
        fun onError(error: Int)
    }

    interface Presenter : IPresenter<SearchView, SearchRouter, UserInteractor> {
        fun onSearch(user: String)
    }

    interface Router : IRouter {
        fun showDetail(user: String)
    }
}

