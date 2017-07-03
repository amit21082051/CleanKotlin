package com.cleanarchitecture.presentation.detail


import com.cleanarchitecture.domain.usersearch.UserDomain
import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.presentation.base.IPresenter
import com.cleanarchitecture.presentation.base.IRouter
import com.cleanarchitecture.presentation.base.IView


interface DetailContract {

    interface View : IView<Presenter> {
        fun update(user: UserDomain)
        fun updateFollowers(users: List<UserDomain>)
        fun onError(error: Int)
    }

    interface Presenter : IPresenter<DetailView, DetailRouter, UserInteractor> {
        fun onUser(user: UserDomain)
        fun onRetrieveUser(user: String)
        fun onRetrieveFollowers(user: String)
    }

    interface Router : IRouter {

    }

}