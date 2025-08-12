package com.example.emailapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.R
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun ItemEmail(email: Email, modifier: Modifier, navigateToDefault: (Long) -> Unit){

    Card(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
        Column(modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
        ) {
            Row (modifier = Modifier
                .fillMaxWidth()
            ) {
                ProfileImage(
                    drawableResource = email.sender.avatar,
                    description = email.sender.fullName
                )
                Column(modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(text = email.sender.firstName)
                    Text(text = email.createAt)
                }
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.clip(CircleShape)) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = stringResource(
                            R.string.favorite
                        )
                    )
                }
            }

            Text(text = email.subject, modifier = Modifier.padding(top = 12.dp, bottom = 8.dp))
            Text(text = email.body, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
    }
}


@Preview
@Composable
fun ItemEmailPreview(){
    ItemEmail(email = LocalEmailDataProvider.get(4L), modifier = Modifier, navigateToDefault = {})
}