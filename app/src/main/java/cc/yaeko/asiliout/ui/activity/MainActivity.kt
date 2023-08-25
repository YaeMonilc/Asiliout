package cc.yaeko.asiliout.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cc.yaeko.asiliout.ui.page.LoginPage
import cc.yaeko.asiliout.ui.page.MainPage
import cc.yaeko.asiliout.ui.page.OtherLogin
import cc.yaeko.asiliout.ui.theme.AsilioutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            AsilioutTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = "LoginPage"
                    ) {
                        composable("LoginPage") {
                            LoginPage(this@MainActivity, navController)
                        }
                        composable("OtherLogin") {
                            OtherLogin(this@MainActivity, navController)
                        }
                        composable("MainPage") {
                            MainPage(this@MainActivity, navController)
                        }
                    }
                }
            }
        }
    }
}