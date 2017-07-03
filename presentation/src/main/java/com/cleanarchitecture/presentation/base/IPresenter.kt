package com.cleanarchitecture.presentation.base

interface IPresenter<V, R, I> {
    var view: V
    var router: R
    var interactor: I
}