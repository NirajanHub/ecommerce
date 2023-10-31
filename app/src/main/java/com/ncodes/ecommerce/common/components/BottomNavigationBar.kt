@file:OptIn(ExperimentalMaterial3Api::class)

package com.ncodes.ecommerce.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ncodes.ecommerce.common.BottomNavItems

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItems>,
    navController: NavController,
    modifier: Modifier,
    onItemClick: (BottomNavItems) -> Unit
) {
    val currentBackStackEntry = navController.currentBackStackEntryAsState()
    NavigationBar(
        modifier = modifier,
        containerColor = Color.Blue,
        tonalElevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == currentBackStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = selected,
                onClick = {
                    onItemClick(item)
                },
                icon = {
                    Column {
                        BadgedBox(badge = {
                            if (item.badgeCount > 0)
                                Text(text = item.badgeCount.toString())
                        }, modifier = Modifier.padding(10.dp)) {
                            Icon(imageVector = item.icon, contentDescription = item.name)
                        }
                    }
                }
            )

        }
    }
}