package org.d3if4010.courtcountermod5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeksViewModel : ViewModel() {
    val _teks= MutableLiveData<String>()

    val teks: LiveData<String>
        get() = _teks

    fun ubahteks(){
        _teks.value = "UwU deh"
    }
}