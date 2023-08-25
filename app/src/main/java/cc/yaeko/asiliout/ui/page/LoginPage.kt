package cc.yaeko.asiliout.ui.page

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cc.yaeko.asiliout.R
import cc.yaeko.asiliout.ui.theme.AsilioutTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(
    componentActivity: ComponentActivity,
    navController: NavController
) {
    var accountString by remember { mutableStateOf("") }
    var passwordString by remember { mutableStateOf("") }

    var rememberPassword by remember { mutableStateOf(false) }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            TopAppBar(
                title = { Text(stringResource(R.string.page_login_title)) }
            )
            Spacer(Modifier.requiredHeight(50.dp))
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.Center),
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                )
            }
            Spacer(Modifier.requiredHeight(50.dp))
            Column {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 40.dp,
                            end = 40.dp
                        )
                ) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(stringResource(R.string.page_login_account)) },
                        value = accountString,
                        onValueChange = { accountString = it }
                    )
                    Spacer(Modifier.requiredHeight(10.dp))
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(stringResource(R.string.page_login_password)) },
                        value = passwordString,
                        onValueChange = { passwordString = it }
                    )
                    Spacer(Modifier.requiredHeight(10.dp))
                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(end = 5.dp)
                                .align(Alignment.CenterEnd),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = rememberPassword,
                                onCheckedChange = { rememberPassword = it },
                            )
                            Text(stringResource(R.string.page_login_remeberPassword))
                        }
                    }
                    Spacer(Modifier.requiredHeight(10.dp))
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            navController.navigate("MainPage")
                        }
                    ) {
                        Text(stringResource(R.string.page_login_login))
                    }
                    Spacer(Modifier.requiredHeight(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            navController.navigate("OtherLogin")
                        }
                    ) {
                        Text(stringResource(R.string.page_login_other))
                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                TextButton(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = {}
                ) {
                    Text(stringResource(R.string.page_login_forgetPassword))
                }
            }
            Spacer(Modifier.requiredHeight(10.dp))
        }
    }
}