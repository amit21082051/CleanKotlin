package com.cleanarchitecture.presentation.extensions

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import com.afollestad.materialdialogs.DialogAction
import com.afollestad.materialdialogs.MaterialDialog
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cleanarchitecture.presentation.R
import com.github.mrengineer13.snackbar.SnackBar


fun View.showError(error: Int) {
    SnackBar.Builder(context as AppCompatActivity)
            .withMessage("This library is awesome!")
            .show()
}

fun View.showDialog(success: () -> Unit) {
    MaterialDialog.Builder(context)
            .title("Do you really want to go forward?")
            .positiveText("Yes")
            .onPositive(
                    { dialog: MaterialDialog, which: DialogAction ->
                        success()
                    }
            )
            .negativeText("No")
            .show()
}

fun View.showProgressDialog(): MaterialDialog.Builder {
    return MaterialDialog.Builder(context)
            .progressIndeterminateStyle(false)
            .progress(true, 0)
            .backgroundColorRes(R.color.colorPrimary)
            .widgetColorRes(R.color.md_divider_white)
            .cancelable(false)
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context)
            .load(url)
            .apply(RequestOptions.circleCropTransform())
            .into(this)
}
