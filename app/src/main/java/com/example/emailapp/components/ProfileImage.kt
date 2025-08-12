package com.example.emailapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.R

@Composable
fun ProfileImage(drawableResource : Int, description: String, modifier: Modifier = Modifier) {

    Image(
        painter = painterResource(id = drawableResource),
        contentDescription = description,
        modifier = modifier
            .size(40.dp)
            .clip(CircleShape))
}


@Preview
@Composable
fun ProfileImagePreview(){
    ProfileImage(
        drawableResource = R.drawable.avatar1,
        description = stringResource(R.string.profile),
        modifier = Modifier.padding(12.dp)
    )
}