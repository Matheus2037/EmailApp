package com.example.emailapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.R
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider
import kotlin.math.max

@Composable
fun SearchBar(modifier: Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
        )
    {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = stringResource(R.string.search),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.search),
            modifier = Modifier
                .padding(16.dp)
                .weight(1f),
            style = MaterialTheme.typography.bodyMedium
        )
        ProfileImage(
            drawableResource = R.drawable.avatar1,
            description = stringResource(R.string.profile),
            modifier = Modifier
                .size(64.dp)
                .padding(12.dp)
        )
    }
}



@Preview
@Composable
fun SearchBarPreview(){
    SearchBar(Modifier)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailDetailAppBar(modifier: Modifier, email: Email, onBackPressed: () -> Unit){

    TopAppBar(title = {
        Column {
            Text(
                text = email.subject,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }, navigationIcon = {
        FilledIconButton(
            onClick = onBackPressed,
            modifier = Modifier
                .padding(2.dp)
                .size(80.dp),
            colors = IconButtonDefaults.filledIconButtonColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(R.string.back),
                modifier = Modifier.padding(8.dp)
            )
        }
    }, actions = {
        IconButton(onClick = { /*TODO*/ }){
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = stringResource(R.string.more))
        }
    })
}


@Preview
@Composable
fun EmailDetailAppBarPreview(){
    EmailDetailAppBar(
        modifier = Modifier,
        email = LocalEmailDataProvider.get(4L),
        onBackPressed = {}
    )
}