package com.example.emailapp

import com.example.emailapp.data.Email

data class EmailUiState(
    val emails : List<Email> = emptyList(),
    val selectedEmail : Email? = null,
    val isDetailOnlyOpen: Boolean = false
    )