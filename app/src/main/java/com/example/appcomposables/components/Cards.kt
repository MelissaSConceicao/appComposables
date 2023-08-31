package com.example.appcomposables.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcomposables.R

@Composable
fun CardSample() {
    Column(modifier = Modifier
            .padding(0.dp, 30.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Shop",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }

            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Home",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }
        }//fim row

        Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.MailOutline,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Post office",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }

            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.Build,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Mechanic",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }
        }

        Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.Call,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Telephony",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }

            Card(modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .shadow(18.dp)) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Icon(
                        modifier = Modifier.size(width = 80.dp, height = 80.dp),
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "Localized description"
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Others...",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                }
            }
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun CardPreview() {
    CardSample()
}


