package com.example.loginapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapps.nav.RooteNav
import com.example.loginapps.nav.navButton
import com.example.loginapps.ui.theme.LoginAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAppsTheme {
                // A surface container using the 'background' color from the theme
//                val navController = rememberNavController()
//                RooteNav(navController = navController)
                AwalPage(navController = rememberNavController())
            }
        }
    }
}

@Composable
fun AwalPage(navController: NavController){
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background)
    ){
        FloatingActionButton(
            onClick = {},
            containerColor = Color.White
        ){
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = "Arrawo Back"
            )
        }
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "APPSLOGINUI ",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Selamat Datang di aplikasi login ui apps menggunakan kotlin compose silahkan ikuti step-stepnya",
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground.copy(0.5f)
            )
            Spacer(Modifier.height(60.dp))
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colorScheme.primaryContainer.copy(0.5f))
                    .shadow(
                        elevation = 40.dp,
                        shape = CircleShape,
                        ambientColor = Color.Black
                    )
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(280.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.surface.copy(0.7f))
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.image1),
                        contentDescription = "IMAGE 1",
                        modifier = Modifier.size(250.dp)
                    )
                }
            }
            Spacer(Modifier.height(40.dp))
            Text(
                text = "Are you Ready ?",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black.copy(0.5f)
            )
            Spacer(Modifier.height(8.dp))
            FloatingActionButton(
                onClick = {
                    navController.navigate(navButton.Phone.route)
                },
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.height(50.dp).width(200.dp),
                shape = RoundedCornerShape(15.dp)

            ) {
                Text(
                    text = "Start",
                    color = Color.White,
                    fontSize = 18.sp,
                )
            }
        }
    }
}

@Preview()
@Composable
fun PreviewAppAwal(){
    AwalPage(navController = rememberNavController())
}