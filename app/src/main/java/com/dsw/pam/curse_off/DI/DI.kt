package com.dsw.pam.curse_off.DI

import com.dsw.pam.curse_off.view_model.RegistrationViewModel
import com.dsw.pam.curse_off.view_model.WalletViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single { SharedPreferencesStorage(get()) }
    viewModel { RegistrationViewModel() }
    viewModel { WalletViewModel(get()) }
}
