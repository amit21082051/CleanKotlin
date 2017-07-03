package com.cleanarchitecture.domain.usersearch

import com.cleanarchitecture.data.repositories.UserRepository
import com.cleanarchitecture.domain.exceptions.ValidationException
import com.cleanarchitecture.domain.validations.ValidationTypes
import io.reactivex.Observable

class UserInteractor {

    fun onSearch(user: String): Observable<UserDomain> {
        userNameValidations(user)

        return UserRepository().onSearch(user).map { userData ->
            UserMapper().map(userData)
        }
    }

    fun followersFrom(user: String): Observable<List<UserDomain>> {
        userNameValidations(user)

        return UserRepository()
                .followersFrom(user)
                .flatMap({ list ->
                    Observable.fromIterable(list)
                            .map({ userData ->
                                UserMapper().map(userData)
                            })
                            .toList()
                            .toObservable()
                })
    }

    fun userNameValidations(user: String) {
        if (user == null || user.isEmpty()) {
            throw ValidationException(ValidationTypes.EMPTY)
        }

        if (user.length < 2) {
            throw ValidationException(ValidationTypes.MINIMUN_SIZE)
        }
    }

}