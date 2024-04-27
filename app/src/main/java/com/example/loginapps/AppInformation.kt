package com.example.loginapps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginapps.nav.RooteNav
import com.example.loginapps.nav.navButton

@Composable
fun AppInformation(
    navController: NavController
){
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        FloatingActionButton(
            onClick = {
                navController.navigate(navButton.Verif.route)
            },
            containerColor = Color.White
        ){
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = "Arrawo Back"
            )
        }
        Column(
            modifier = Modifier
                .padding()
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
                text = "Your Information",
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "Your Information Detail you can see in the below !!",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(40.dp))
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .size(height = 400.dp, width = 300.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.White)

            ){
                Column {
                    IsianCard("Your Name", "Alfi Nur")
                    IsianCard("Email", "alfinurdani@gmail.com")
                    IsianCard("Nomor Telp", "093021832")
                    IsianCard("Alamat", "Sidoarjo")
                }
            }
            Spacer(Modifier.height(10.dp))
            FloatingActionButton(
                onClick = {
                    navController.navigate(navButton.Main.route)
                },
                shape = RoundedCornerShape(15.dp),
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.height(50.dp).width(200.dp)
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 18.sp,
                )
            }
        }
    }
}

@Composable
fun IsianCard(text1 : String, text2 : String){
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(
            text = text1,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground.copy(0.5f)
        )
        Spacer(Modifier.height(10.dp))
        Box(
        modifier = Modifier
            .size(width = 300.dp, height = 40.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .padding(10.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = text2,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 10.dp),
                textAlign = TextAlign.Start

            )
        }
    }
}


@Preview
@Composable
fun PreviewInformation(){
    AppInformation(navController = rememberNavController())
}