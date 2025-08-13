package com.example.emailapp.components

import android.provider.Telephony.Mms.Inbox
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.emailapp.EmailUiAction
import com.example.emailapp.EmailUiState
import com.example.emailapp.R
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailAppContent(
    modifier: Modifier = Modifier,
    uiState: EmailUiState,
    uiAction: EmailUiAction,
){
    Column(modifier = Modifier.fillMaxSize()) {

    }

}

object EmailRote{
    const val INBOX = "Inbox"
    const val FAVORITES = "Favorites"
    const val SETTINGS = "Settings"
    const val PROFILE = "Profile"
}

data class EmailTopLevelDestination(
    val route : String,
    val selectedIcon : ImageVector,
    val iconTextId : Int
)
val TOP_LEVEL_DESTINATIONS = listOf(
    EmailTopLevelDestination(
        route = EmailRote.INBOX,
        selectedIcon = Icons.Default.Email,
        iconTextId =  R.string.tab_inbox
    ),
    EmailTopLevelDestination(
        route = EmailRote.FAVORITES,
        selectedIcon = Icons.Default.Favorite,
        iconTextId =  R.string.tab_favorite
    ),
    EmailTopLevelDestination(
        route = EmailRote.SETTINGS,
        selectedIcon = Icons.Default.Settings,
        iconTextId =  R.string.tab_settings
    ),
    EmailTopLevelDestination(
        route = EmailRote.PROFILE,
        selectedIcon = Icons.Default.Person,
        iconTextId =  R.string.tab_profile
    )

)


@Preview
@Composable
fun EmailAppContentPreview(){
    EmailAppContent(
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
