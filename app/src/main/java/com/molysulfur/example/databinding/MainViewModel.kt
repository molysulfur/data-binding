package com.molysulfur.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _numbers: MutableLiveData<Int> = MutableLiveData(0)

    var number : Int = 0
    val numbers: LiveData<Int> = _numbers

    fun onClick() {
        _numbers.value = (_numbers.value ?: 0) + 1
    }


}