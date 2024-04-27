package com.example.loginapps

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginapps.nav.navButton

@Composable
fun AppWithPhone(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        FloatingActionButton(
            onClick = {
                navController.navigate(navButton.Main.route)
            },
            containerColor = Color.White
        ) {
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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                text = "Continue With Phone",
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "We will send One Time Password on this Phone Number !!",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(60.dp))
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape)
                    .size(280.dp)
                    .background(MaterialTheme.colorScheme.primary.copy(0.7f))
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "IMAGE 2",
                    modifier = Modifier
                        .size(250.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Text(
                text = "03898493232",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(Modifier.height(16.dp))
            Divider(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.onBackground.copy(0.5f)
            )
            Spacer(Modifier.height(30.dp))
            FloatingActionButton(
                onClick = {
                    navController.navigate(navButton.Verif.route)
                },
                shape = RoundedCornerShape(15.dp),
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.height(50.dp).width(200.dp)
            ) {
                Text(
                    text = "SEND OTP",
                    color = Color.White,
                    fontSize = 18.sp,
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewPhone(){
    AppWithPhone(navController = rememberNavController())
}