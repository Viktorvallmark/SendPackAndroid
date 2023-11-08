package com.example.packsend

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material.icons.sharp.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
public fun LandingPage(navHostController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        var selectedItem by remember { mutableIntStateOf(0) }
        val items = listOf<String>(
            "Post a new delivery",
            "Rate your driver",
            "Chat with your driver",
            "Dude, where's my package?"
        )
        Box(modifier = Modifier.fillMaxWidth()) {
            when (selectedItem) {
                0 -> Text(text = "Post new delivery information")
                1 -> Text(text = "Rate your driver information")
                2 -> Text(text = "Chat with your driver")
                3 -> Text(text = "Where is my package?")
            }
        }


        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Bottom) {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
                        label = { Text(item, textAlign = TextAlign.Center) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index }
                    )
                }
            }

        }


        /*   Column( modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End) {
            NavigationBar(modifier = Modifier.fillMaxWidth()) {
                NavigationBarItem(selected = false,
                    onClick = {},
                    icon = { Icon(Icons.Sharp.ShoppingCart, "Post job")},
                    label = { Text(
                        text = "Post job"
                    )})
                NavigationBarItem(selected = false,
                    onClick = {item = "ratedriver" },
                    icon = { Icon(Icons.Sharp.Face, "rate driver")},
                    label = { Text(
                        text = "Rate driver")}
                )
                NavigationBarItem(selected = false,
                    onClick = { item = "chat"},
                    icon = { Icon(Icons.Sharp.Person, "Chat with driver") },
                    label = { Text(
                        text = "Chat")}
                )
                NavigationBarItem(selected = false,
                    onClick = { item = "wherepackage"},
                    icon = { Icon(Icons.Sharp.Search, "Locate package") },
                    label = { Text(
                        text = "Where is my package?" )}
                )
            }
        }
    } */

    }
}