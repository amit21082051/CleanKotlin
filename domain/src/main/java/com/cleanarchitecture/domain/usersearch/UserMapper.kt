package com.cleanarchitecture.domain.usersearch

import com.cleanarchitecture.data.model.UserData

class UserMapper {

    fun map(userData: UserData): UserDomain {
        var userDomain = UserDomain()

        userDomain.login = userData.login
        userDomain.id = userData.id
        userDomain.avatarUrl = userData.avatarUrl
        userDomain.gravatarId = userData.gravatarId
        userDomain.url = userData.url
        userDomain.htmlUrl = userData.htmlUrl
        userDomain.followersUrl = userData.followersUrl
        userDomain.followingUrl = userData.followingUrl
        userDomain.gistsUrl = userData.gistsUrl
        userDomain.starredUrl = userData.starredUrl
        userDomain.subscriptionsUrl = userData.subscriptionsUrl
        userDomain.organizationsUrl = userData.organizationsUrl
        userDomain.reposUrl = userData.reposUrl
        userDomain.eventsUrl = userData.eventsUrl
        userDomain.receivedEventsUrl = userData.receivedEventsUrl
        userDomain.type = userData.type
        userDomain.siteAdmin = userData.siteAdmin
        userDomain.name = userData.name
        userDomain.company = userData.company
        userDomain.blog = userData.blog
        userDomain.location = userData.location
        userDomain.email = userData.email
        userDomain.hireable = userData.hireable
        userDomain.bio = userData.bio
        userDomain.publicRepos = userData.publicRepos
        userDomain.publicGists = userData.publicGists
        userDomain.followers = userData.followers
        userDomain.following = userData.following
        userDomain.createdAt = userData.createdAt
        userDomain.updatedAt = userData.updatedAt

        return userDomain
    }

}