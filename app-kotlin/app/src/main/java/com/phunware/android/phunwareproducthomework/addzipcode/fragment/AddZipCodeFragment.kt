package com.phunware.android.phunwareproducthomework.addzipcode.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phunware.android.phunwareproducthomework.R
import kotlinx.android.synthetic.main.item_zipcode.*

class AddZipCodeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_zipcode, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val zipCode = AddZipCodeFragmentArgs.fromBundle(arguments).zipCode

        zipCodeTextView.text = zipCode
    }
}