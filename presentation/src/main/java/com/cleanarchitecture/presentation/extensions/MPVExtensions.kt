package com.cleanarchitecture.presentation.extensions

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.cleanarchitecture.presentation.base.IRouter



fun IRouter.startActivity(intent: Intent) {
    mContext.startActivity(intent)
}

fun IRouter.finish() {
    if (mContext is AppCompatActivity) {
        (mContext as AppCompatActivity).finish()
    }
}

