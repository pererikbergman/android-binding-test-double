package com.rakangsoftware.bindingadapter

import android.databinding.BindingAdapter
import android.databinding.InverseBindingAdapter
import android.widget.TextView

@BindingAdapter("android:text")
fun setDoubleValue(view: TextView, value: Double) {
    view.text = value.toString()
}

@InverseBindingAdapter(attribute = "android:text")
fun getDoubleValue(view: TextView): Double {
    return view.text.toString().toDoubleOrNull() ?: 0.0
}