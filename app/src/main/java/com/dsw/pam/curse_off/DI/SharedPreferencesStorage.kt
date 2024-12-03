package com.dsw.pam.curse_off.DI

import android.content.Context
import com.dsw.pam.curse_off.ui.DataStorage

 class SharedPreferencesStorage(private val context: Context) : DataStorage {
     companion object{
         const val STRING = "klucz"
         const val DOUBLE = "kluczdouble"
     }
    private val sharedPreferences = context.getSharedPreferences("my_preferences", Context.MODE_PRIVATE)

    override fun saveString(value: String) {
        sharedPreferences.edit().putString(STRING, value).apply()
    }

    override fun getString(defaultValue: String): String {
        return sharedPreferences.getString(STRING, defaultValue) ?: defaultValue
    }

     override fun saveDouble(newAmount: Double) {
         sharedPreferences.edit().putFloat(DOUBLE, newAmount.toFloat()).apply()
     }
     //inne implementacje etc.
}