package com.example.emailapp.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.emailapp.EmailUiAction
import com.example.emailapp.EmailUiState
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailContent(
    modifier: Modifier = Modifier,
    uiState: EmailUiState,
    uiAction: EmailUiAction,
    emailLazyListState: LazyListState
){
    if (uiState.selectedEmail != null && uiState.isDetailOnlyOpen) {
        BackHandler {
            uiAction.back()
        }
        EmailDetail(email = uiState.selectedEmail, uiAction = uiAction)
    } else{
        ListEmail(
            uiState = uiState,
            uiAction = uiAction,
            emailLazyListState = emailLazyListState,
            modifier = modifier)
    }
}



@Preview
@Composable
fun EmailContentPreview(){
    EmailContent(
        uiState = EmailUiState(emails = LocalEmailDataProvider.allEmails),
        uiAction = object : EmailUiAction{
            override fun navigationToDetail(emailId: Long) {
                TODO("Not yet implemented")
            }

            override fun back() {
                TODO("Not yet implemented")
            }
        },
        emailLazyListState = rememberLazyListState()
    )
}