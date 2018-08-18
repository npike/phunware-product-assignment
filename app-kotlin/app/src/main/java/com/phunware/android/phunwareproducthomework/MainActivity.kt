package com.phunware.android.phunwareproducthomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(this, findNavController(R.id.my_nav_host_fragment))
    }

    override fun onSupportNavigateUp() = findNavController(this, R.id.my_nav_host_fragment).navigateUp()
}
