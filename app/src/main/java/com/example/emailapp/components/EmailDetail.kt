package com.example.emailapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.EmailUiAction
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailDetail(email: Email, modifier: Modifier = Modifier, uiAction: EmailUiAction){
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            EmailDetailAppBar(email = email) {
                uiAction.back()
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            EmailDetailItem(email = email, modifier = Modifier.padding(16.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EmailDetailPreview(){
    EmailDetail(email = LocalEmailDataProvider.get(4L), uiAction = object : EmailUiAction {
        override fun navigationToDetail(emailId: Long) {
            TODO("Not yet implemented")
        }

        override fun back() {
            TODO("Not yet implemented")
        }
    })
}