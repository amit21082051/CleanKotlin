package com.cleanarchitecture.presentation.search

import android.app.Dialog
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_search.view.*
import com.cleanarchitecture.presentation.extensions.showError
import com.cleanarchitecture.presentation.extensions.showProgressDialog


class SearchView : LinearLayout, SearchContract.View {

    override var presenter: SearchContract.Presenter? = null
    override var progressBar: Dialog? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)


    override fun onFinishInflate() {
        super.onFinishInflate()
        bt_search.setOnClickListener(searchClick())
    }


    override fun showProgress() {
        progressBar = showProgressDialog().show()
    }

    override fun hideProgress() {
        progressBar!!.dismiss()
    }


    fun searchClick(): OnClickListener? {
        return View.OnClickListener {
            presenter!!.onSearch(ed_user_name.text.toString())
        }
    }

    override fun onError(error: Int) {
        showError(error)
    }
}