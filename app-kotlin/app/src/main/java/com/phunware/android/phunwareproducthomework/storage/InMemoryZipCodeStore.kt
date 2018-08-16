package com.phunware.android.phunwareproducthomework.storage

class InMemoryZipCodeStore : ZipCodeStore {
    private var _zipCodes: MutableList<String> = mutableListOf()

    /**
     * Return a mutable list (defensive copy) of our zip codes
     */
    override fun getZipCodes(): List<String> = _zipCodes.toList()

    override fun addZipCode(zipcode: String) {
        _zipCodes.add(zipcode)
    }
}