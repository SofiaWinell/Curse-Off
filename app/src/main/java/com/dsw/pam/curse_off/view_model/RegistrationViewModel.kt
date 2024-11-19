package com.dsw.pam.curse_off.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class RegistrationViewModel: ViewModel(), KoinComponent {
    val injectedStringExample: String by inject()


    private val _username = MutableStateFlow("")
    private val _email = MutableStateFlow("")
    private val _password = MutableStateFlow("")
    private val _confirmPassword = MutableStateFlow("")
    private val _isRegistrationSuccessful = MutableStateFlow(false)

    val username: StateFlow<String> = _username
    val email: StateFlow<String> = _email
    val password: StateFlow<String> = _password
    val confirmPassword: StateFlow<String> = _confirmPassword
    val isRegistrationSuccessful: StateFlow<Boolean> = _isRegistrationSuccessful

    fun onUsernameChanged(newUsername: String) {
        _username.value = newUsername
    }

    fun onEmailChanged(newEmail: String) {
        _email.value = newEmail
    }

    fun onPasswordChanged(newPassword: String) {
        _password.value = newPassword
    }

    fun onConfirmPasswordChanged(newConfirmPassword: String) {
        _confirmPassword.value = newConfirmPassword
    }

    fun register() {
        viewModelScope.launch {
            if (_password.value == _confirmPassword.value && _email.value.isNotEmpty() && _username.value.isNotEmpty()) {
                _isRegistrationSuccessful.value = true
            } else {
                _isRegistrationSuccessful.value = false
            }
        }
    }
}



