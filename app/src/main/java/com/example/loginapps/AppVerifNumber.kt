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
import androidx.compose.ui.draw.shadow
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
fun AppVerifNumber(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)
            .fillMaxSize()
    ) {
        FloatingActionButton(
            onClick = {
                navController.navigate(navButton.Phone.route)
            },
            containerColor = Color.White
        ) {
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = "Arrawo Back"
            )
        }
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
                text = "Verify Mobile Number",
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "We sent a Verification code to 03898493232 Enter the code below !!",
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
                    .background(MaterialTheme.colorScheme.surfaceTint.copy(0.5f))
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(R.drawable.image3),
                    contentDescription = "IMAGE 2",
                    modifier = Modifier
                        .size(250.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CardInputRow("2", Color.Black)
                CardInputRow("3", Color.Black.copy(0.5f))
                CardInputRow("0",  Color.Black.copy(0.5f))
                CardInputRow("4",  Color.Black.copy(0.5f))
            }
            Spacer(Modifier.height(36.dp))
            FloatingActionButton(
                onClick = {
                    navController.navigate(navButton.Information.route)
                },
                shape = RoundedCornerShape(15.dp),
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.height(50.dp).width(200.dp)
            ) {
                Text(
                    text = "VERIFY & PROTECTED",
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontSize = 18.sp,
                )
            }
            Spacer(Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .padding(horizontal = 5.dp)
            ){
                Text(
                    text = "Don't Receive Code ??",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = " Resend Code !!",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Blue.copy(0.7f),
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}


@Composable
fun CardInputRow(number : String, color : Color) {
    Box(
        modifier = Modifier
            .size(60.dp)
            .fillMaxWidth()
            .shadow(elevation = 6.dp, shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = number,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = color
        )
    }
}


@Preview
@Composable
fun PreviewVerif(){
    AppVerifNumber(navController = rememberNavController())
}