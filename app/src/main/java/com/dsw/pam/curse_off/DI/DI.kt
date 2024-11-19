package com.dsw.pam.curse_off.DI

import com.dsw.pam.curse_off.view_model.RegistrationViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
val appModule = module {
    single<String>{
        "Hello Zosia & Karina!"
    }
    viewModel { RegistrationViewModel() }
}