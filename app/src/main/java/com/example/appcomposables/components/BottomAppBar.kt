package com.example.appcomposables.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleBottomAppBar() {
    BottomAppBar {
        IconButton(onClick = { /* doSomething() */ },
            modifier = Modifier.size(width = 100.dp, height = 100.dp)) {
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Filled.LocationOn, contentDescription = "Localized description")
                Text(text = "Location")
            }
        }

        IconButton(onClick = { /* doSomething() */ },
            modifier = Modifier.size(width = 100.dp, height = 100.dp)) {
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Filled.Menu, contentDescription = "Localized description")
                Text(text = "Browse")
            }
        }

        IconButton(onClick = { /* doSomething() */ },
            modifier = Modifier.size(width = 100.dp, height = 100.dp)) {
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
                Text(text = "Favorites")
            }
        }

        IconButton(onClick = { /* doSomething() */ },
            modifier = Modifier.size(width = 100.dp, height = 100.dp)) {
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Filled.Person, contentDescription = "Localized description")
                Text(text = "Profile")
            }
        }
    }
}