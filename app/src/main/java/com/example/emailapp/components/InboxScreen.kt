package com.example.emailapp.components

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.EmailUiAction
import com.example.emailapp.EmailUiState
import com.example.emailapp.R
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun InboxScreen(
    modifier: Modifier = Modifier,
    uiState: EmailUiState,
    uiAction: EmailUiAction,
) {
    val emailLazyListState = rememberLazyListState()
    Box(modifier = modifier.fillMaxSize()) {
        EmailContent(
            uiState = uiState,
            uiAction = uiAction,
            emailLazyListState = emailLazyListState)

        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = stringResource(R.string.edit),
                modifier = Modifier.size(28.dp))
        }
    }
}


@Preview
@Composable
fun InboxScreenPreview(){
    InboxScreen(
        uiState = EmailUiState(emails = LocalEmailDataProvider.allEmails),
        uiAction = object : EmailUiAction{
            override fun navigationToDetail(emailId: Long) {
                TODO("Not yet implemented")
            }

            override fun back() {
                TODO("Not yet implemented")
            }
        }
    )
}