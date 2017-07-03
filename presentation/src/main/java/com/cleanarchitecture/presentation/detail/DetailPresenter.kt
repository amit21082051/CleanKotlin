package com.cleanarchitecture.presentation.detail

import android.util.Log
import com.cleanarchitecture.domain.exceptions.ValidationException
import com.cleanarchitecture.domain.usersearch.UserDomain
import com.cleanarchitecture.domain.usersearch.UserInteractor
import com.cleanarchitecture.domain.validations.ValidationTypes
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DetailPresenter(override var view: DetailView, override var router: DetailRouter, override var interactor: UserInteractor) : DetailContract.Presenter {

    override fun onUser(user: UserDomain) {

    }

    override fun onRetrieveUser(user: String) {
        Log.v("Presenter", user)

        try {
            interactor.onSearch(user)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            { userDomain ->
                                view.update(userDomain)
                            },
                            { error ->
                                Log.v("Error", error.localizedMessage)
                                view.onError(4)
                            }
                    )
        } catch (e: ValidationException) {
            errorMapper(e)
        }
    }

    override fun onRetrieveFollowers(user: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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