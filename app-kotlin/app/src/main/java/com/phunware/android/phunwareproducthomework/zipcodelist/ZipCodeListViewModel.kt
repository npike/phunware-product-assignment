package com.phunware.android.phunwareproducthomework.zipcodelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.phunware.android.phunwareproducthomework.WeatherApp
import com.phunware.android.phunwareproducthomework.storage.ZipCodeStore
import javax.inject.Inject

class ZipCodeListViewModel: ViewModel() {

    @Inject
    lateinit var zipCodeStore: ZipCodeStore

    init {
        WeatherApp.getApplicationComponent().inject(this)
    }

    private var zipCodes: MutableLiveData<List<String>>? = null

    fun getZipCodes(): LiveData<List<String>> {
        if (zipCodes == null) {
            zipCodes = MutableLiveData()
            loadZipCodes()
        }
        return zipCodes!!
    }

    private fun loadZipCodes() {
        if (zipCodes == null) {
            zipCodes = MutableLiveData()
        }
        zipCodes!!.value = zipCodeStore.getZipCodes()
    }
}