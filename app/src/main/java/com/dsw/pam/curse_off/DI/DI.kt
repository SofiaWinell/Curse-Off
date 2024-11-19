package com.dsw.pam.curse_off.DI

import org.koin.dsl.module
val appModule = module {
    single<String>{
        "Hello Zosia & Karina!"
    }
}