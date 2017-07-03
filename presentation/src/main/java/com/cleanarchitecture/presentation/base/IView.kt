package com.cleanarchitecture.presentation.base

import android.app.Dialog

interface IView<P> {
    var presenter: P?
    var progressBar: Dialog?

    fun showProgress()
    fun hideProgress()
}