package com.example.emailapp

import androidx.lifecycle.ViewModel
import com.example.emailapp.data.LocalEmailDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class EmailViewModel : ViewModel(), EmailUiAction {

    private val _uiState = MutableStateFlow(EmailUiState())
    val uiState = _uiState.asStateFlow()

    init {
        initEmails()
    }

    private fun initEmails(){
        val emails = LocalEmailDataProvider.allEmails
        _uiState.update { it.copy(emails = emails) }
    }

    override fun navigationToDetail(emailId: Long) {
        _uiState.update { it.copy(isDetailOnlyOpen = true, selectedEmail = LocalEmailDataProvider.get(emailId)) }
    }

    override fun back() {
        _uiState.update { it.copy(isDetailOnlyOpen = false, selectedEmail = null) }
    }

}