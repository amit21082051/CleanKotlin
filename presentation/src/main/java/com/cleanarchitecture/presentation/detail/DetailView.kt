package com.cleanarchitecture.presentation.detail

import android.app.Dialog
import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.cleanarchitecture.domain.usersearch.UserDomain
import com.cleanarchitecture.presentation.extensions.loadUrl
import com.cleanarchitecture.presentation.extensions.showError
import com.cleanarchitecture.presentation.extensions.showProgressDialog
import kotlinx.android.synthetic.main.view_detail.view.*

class DetailView : LinearLayout, DetailContract.View {

    override var presenter: DetailContract.Presenter? = null
    override var progressBar: Dialog? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)


    override fun onFinishInflate() {
        super.onFinishInflate()
    }


    override fun showProgress() {
        progressBar = showProgressDialog().show()
    }

    override fun hideProgress() {
        progressBar!!.dismiss()
    }


    override fun update(user: UserDomain) {
        iv_avatar.loadUrl(user.avatarUrl!!)
        tv_name.text = user.name
        tv_login.text = user.login
    }

    override fun updateFollowers(users: List<UserDomain>) {

    }

    override fun onError(error: Int) {
        showError(error)
    }

}