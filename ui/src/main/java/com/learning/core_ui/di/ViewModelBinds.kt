package com.learning.core_ui.di

import com.learning.course.ViewMod
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelBinds {


    @Binds
    @ViewModelKey(ViewMod::class)
    @IntoMap
    fun bindViewMod(viewModel : ViewMod) : ViewMod
}