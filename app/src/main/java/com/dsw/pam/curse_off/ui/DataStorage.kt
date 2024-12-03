package com.dsw.pam.curse_off.ui

interface DataStorage {
    fun saveString(value: String)
    fun getString(defaultValue: String): String
    fun saveDouble(newAmount: Double)
    // oraz inne metody dla innych typów danych, np. saveInt, getInt itp.
}