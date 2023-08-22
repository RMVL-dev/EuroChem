package com.example.eurochem.ui.screens.wb

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eurochem.R

@Composable
fun WelcomeBookCompanyScaleScreen(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier
        .fillMaxSize()
        .background(getBackgroundBrush())
    ) {
        Column(modifier = modifier
            .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.wb_scale_company),
                modifier = modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 30.sp
            )
            Column(modifier = modifier.fillMaxWidth()) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 20.sp
                    )
                    Text(
                        modifier = modifier.padding(start = 5.dp),
                        text = stringResource(id = R.string.wb_sc_description_1),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Text(
                    text = stringResource(id = R.string.wb_sc_description_2),
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Row(modifier = modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ec_facility),
                    contentDescription = stringResource(R.string.facility),
                    modifier = modifier.size(100.dp)
                )
                ScaleCard(
                    title = R.string.wb_sc_count_facilities,
                    body = R.string.wb_sc_cf_description
                )
            }
            Row(modifier = modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.engineer),
                    contentDescription = stringResource(R.string.engineer),
                    modifier = modifier.size(100.dp)
                )
                ScaleCard(
                    title = R.string.wb_sc_count_employers,
                    body = R.string.wb_sc_ce_descriptor
                )
            }
        }
    }
}

@Composable
fun ScaleCard(
    @StringRes title:Int = R.string.wb_sc_count_facilities,
    @StringRes body:Int = R.string.wb_sc_cf_description,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier.wrapContentSize(), shape = MaterialTheme.shapes.large) {
        Box(modifier = modifier
            .clip(MaterialTheme.shapes.large)
            .background(Color.DarkGray)
        ) {
            Column(modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = title),
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = modifier.padding(13.dp)
                )
                Box(
                    modifier = modifier
                        .clip(MaterialTheme.shapes.medium)
                        .fillMaxWidth()
                        .background(getCardBrush())
                ) {
                    Text(
                        text = stringResource(id = body),
                        style = MaterialTheme.typography.bodySmall,
                        modifier = modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}



@Composable
@Preview
fun ScaleCompanyPrev(){
    WelcomeBookCompanyScaleScreen()
}

@Composable
@Preview
fun CardPreview(){
    ScaleCard()
}