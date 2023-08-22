package com.example.eurochem.ui.screens.wb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eurochem.R

@Composable
fun WelcomeBookMainScreen(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier
        .background(getBackgroundBrush())
        .fillMaxSize()
    ) {
        Column(
            modifier = modifier
                .fillMaxSize(),
        ) {
            Column(
                modifier = modifier
                    .padding(16.dp)
            ) {
                Image(
                    modifier = modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = stringResource(R.string.wb_descr_menu)
                )
                Text(
                    modifier = modifier
                        .padding(start = 55.dp),
                    text = stringResource(id = R.string.wb_fs_welcome).trimMargin(),
                    style = MaterialTheme.typography.headlineLarge,
                )
            }
            Image(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp),
                painter = painterResource(id = R.drawable.eurochem_1),
                contentDescription = stringResource(R.string.eurochem),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(top = 100.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    modifier = modifier,
                        //.padding(bottom = 55.dp),
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.bodyMedium,
                )
                Image(
                    modifier = modifier.size(80.dp),
                    painter = painterResource(id = R.drawable.logo_eurochem),
                    contentDescription = stringResource(R.string.logo_eurochem)
                )
            }
        }
    }
}


@Composable
@Preview
fun MainWBPreview(){
    WelcomeBookMainScreen()
}