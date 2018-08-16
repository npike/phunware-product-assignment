package com.phunware.android.phunwareproducthomework.dagger

import com.phunware.android.phunwareproducthomework.WeatherApp
import com.phunware.android.phunwareproducthomework.zipcodelist.ZipCodeListViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ZipCodeStoreModule::class)])
interface AppComponent {
    fun inject(weatherApp: WeatherApp)
    fun inject(zipCodeListViewModel: ZipCodeListViewModel)

    @Component.Builder
    interface Builder {

        fun zipCodeStoreModule(zipCodeStoreModule: ZipCodeStoreModule): Builder

        @BindsInstance
        fun application(weatherApp: WeatherApp): Builder

        fun build(): AppComponent
    }
}