package com.dsw.pam.curse_off.view_model

import androidx.lifecycle.ViewModel
import com.dsw.pam.curse_off.ui.DataStorage
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WalletViewModel(private val dataStorage: DataStorage) : ViewModel(), KoinComponent {
    val injectedDoubleExample: Double by inject()

    fun saveWalletAmount(newAmount: Double) {
        // Walidacja i dodatkowe obliczenia
        if (newAmount >= 0) {
            dataStorage.saveDouble(newAmount)
        } else {
            // Obsługa błędu
        }
    }
}
 