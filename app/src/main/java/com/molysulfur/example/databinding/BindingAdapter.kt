package com.molysulfur.example.databinding

import android.os.Build
import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

object BindingAdapters {

    @BindingAdapter("app:hideIsTen")
    @JvmStatic
    fun hideIsTen(view: View, number: Int) {
        view.visibility = if (number == 10) View.GONE else View.VISIBLE
    }


    @BindingAdapter(value = ["android:max", "android:progress"], requireAll = true)
    @JvmStatic
    fun updateProgress(progressBar: ProgressBar, max: Int, progress: Int) {
        progressBar.max = max
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            progressBar.setProgress(progress, false)
        } else {
            progressBar.progress = progress
        }
    }

}

