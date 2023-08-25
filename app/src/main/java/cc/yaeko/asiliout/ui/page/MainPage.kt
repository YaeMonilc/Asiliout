package cc.yaeko.asiliout.ui.page

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainPage(
    componentActivity: ComponentActivity,
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        NavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            NavigationBarItem(
                selected = true,
                icon = { Image(imageVector = Icons.Default.Home, contentDescription = null) },
                label = { Text("HOME") },
                onClick = {

                }
            )
            NavigationBarItem(
                selected = false,
                icon = { Image(imageVector = Icons.Default.List, contentDescription = null) },
                label = { Text("LIST") },
                onClick = {

                }
            )
            NavigationBarItem(
                selected = false,
                icon = { Image(imageVector = Icons.Default.Person, contentDescription = null) },
                label = { Text("ME") },
                onClick = {

                }
            )
        }
    }
}