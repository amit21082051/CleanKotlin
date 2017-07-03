package com.cleanarchitecture.presentation.search

import android.content.Context
import android.content.Intent
import com.cleanarchitecture.presentation.detail.DetailActivity
import com.cleanarchitecture.presentation.extensions.startActivity

class SearchRouter(override var mContext: Context) : SearchContract.Router {

    override fun showDetail(user: String) {
        startActivity(Intent(mContext, DetailActivity::class.java))
    }

}