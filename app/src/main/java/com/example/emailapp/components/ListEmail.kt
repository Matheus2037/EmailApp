package com.example.emailapp.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.emailapp.EmailUiAction
import com.example.emailapp.EmailUiState
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun ListEmail(
    modifier: Modifier = Modifier,
    uiState: EmailUiState,
    uiAction: EmailUiAction,
    emailLazyListState: LazyListState
) {

    LazyColumn(modifier = modifier, state = emailLazyListState) {
        item {
            SearchBar()
        }
        items(uiState.emails) { email ->
            ItemEmail(email = email) { emailId ->
                uiAction.navigationToDetail(emailId)
            }
        }
    }

}


@Preview
@Composable
fun ListEmailPreview() {
    ListEmail(
        uiState = EmailUiState(emails = LocalEmailDataProvider.allEmails),
        uiAction = object : EmailUiAction{
            override fun navigationToDetail(emailId: Long) {
                TODO("Not yet implemented")
            }

            override fun back() {
                TODO("Not yet implemented")
            }
        },
        emailLazyListState = rememberLazyListState())
}