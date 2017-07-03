package com.cleanarchitecture.presentation.search

import android.util.Log
import com.cleanarchitecture.domain.exceptions.ValidationException
import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.domain.validations.ValidationTypes
import com.cleanarchitecture.presentation.extensions.showDialog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SearchPresenter(override var view: SearchView, override var router: SearchRouter, override var interactor: UserInteractor) : SearchContract.Presenter {

    override fun onSearch(user: String) {
        Log.v("Presenter", user)

        view.showProgress()
        try {
            interactor.onSearch(user)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            { userDomain ->
                                view.hideProgress()
                                view.showDialog {
                                    router.showDetail(user)
                                }
                            },
                            { error ->
                                view.hideProgress()
                                Log.v("Error", error.localizedMessage)
                                view.onError(4)
                            }
                    )
        } catch (e: ValidationException) {
            view.hideProgress()
            errorMapper(e)
        }
    }

    fun errorMapper(e: ValidationException) {
        var message: Int

        when (e.valueType) {
            ValidationTypes.EMPTY -> message = 1
            ValidationTypes.MINIMUN_SIZE -> message = 2
        }

        view.onError(message)
    }

}
