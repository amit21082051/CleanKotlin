package com.cleanarchitecture.data.repositories

import com.cleanarchitecture.data.ws.GithubApi
import com.cleanarchitecture.data.model.UserData
import io.reactivex.Observable

class UserRepository {

    fun onSearch(user: String): Observable<UserData> {
        return GithubApi.create().user(user)
    }

    fun followersFrom(user: String): Observable<List<UserData>> {
        return GithubApi.create().followers(user)
    }

}