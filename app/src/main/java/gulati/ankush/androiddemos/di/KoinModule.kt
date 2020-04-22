package gulati.ankush.androiddemos.di

import gulati.ankush.androiddemos.ui.main.basics.BasicsViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val koinModule = module {
    viewModel { BasicsViewModel() }
}



