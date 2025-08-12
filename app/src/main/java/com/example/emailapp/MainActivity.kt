package com.example.emailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.emailapp.ui.theme.EmailAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<EmailViewModel>()

        setContent {
            val uiState by viewModel.uiState.collectAsState()

            EmailAppTheme {

            }
        }
    }
}