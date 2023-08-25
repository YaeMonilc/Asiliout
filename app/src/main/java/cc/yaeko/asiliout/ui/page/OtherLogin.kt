package cc.yaeko.asiliout.ui.page

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cc.yaeko.asiliout.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherLogin(
    componentActivity: ComponentActivity,
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
        ) {
            TopAppBar(
                title = { Text(stringResource(R.string.page_otherLogin_title)) },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Image(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                        )
                    }
                }
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                LoginWay(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Image(
                        imageVector = Icons.Default.Build,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                    )
                    Spacer(Modifier.requiredWidth(20.dp))
                    Text("GITHUB")
                }
                Spacer(Modifier.requiredHeight(15.dp))
                LoginWay(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Image(
                        imageVector = Icons.Default.Place,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                    )
                    Spacer(Modifier.requiredWidth(20.dp))
                    Text("QQ")
                }
                Spacer(Modifier.requiredHeight(15.dp))
                LoginWay(
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Image(
                        imageVector = Icons.Default.Edit,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                    )
                    Spacer(Modifier.requiredWidth(20.dp))
                    Text("WECHAT")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginWay(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable () -> Unit,
) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier),
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                content()
            }
        }
    }
}