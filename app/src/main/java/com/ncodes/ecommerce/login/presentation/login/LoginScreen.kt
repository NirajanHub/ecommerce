package com.ncodes.ecommerce.login.presentation.login

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ncodes.ecommerce.login.presentation.LoginViewModel
import com.ncodes.ecommerce.common.components.CustomTextField
import com.ncodes.ecommerce.common.components.PasswordTextField
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.Screens

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    navController: NavController? ,
){
    var username by rememberSaveable{mutableStateOf("")}
    var email by rememberSaveable{mutableStateOf("")}
    var password by rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.padding(top = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier= Modifier
                    .clip(CircleShape)
                    .border(2.dp, Color.Black, CircleShape),
                painter = painterResource(
                id = R.drawable.ic_launcher_background),
                contentDescription = "Content")
            Text(
                text = stringResource(id = R.string.login),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                textAlign = TextAlign.Center
            )
            Column {
                CustomTextField(
                    text = username,
                    resource = R.string.username,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        bottom = 10.dp
                    ),
                    onValueChanged = {
                        username = it
                    }
                )
                CustomTextField(
                    text = email,
                    resource = R.string.email,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        bottom = 10.dp
                    ),
                    onValueChanged = {
                        email = it
                    }
                )
                 PasswordTextField(
                    text = password,
                    resource = R.string.password,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        bottom = 10.dp
                    ),
                    onValueChanged = {
                        password = it
                    }
                 )
            }
            Button(
                modifier = Modifier.padding(top = 20.dp),
                onClick = {
                    navController!!.navigate(Screens.LandingScreen.route)
                       Log.e("Print: ","viewModel.getAllProduct()")
                },)
            {
                Text(text = stringResource(id = R.string.submit))
            }
        }
    }
}
@Preview
@Composable
fun PreviewScreen(){
    LoginScreen(navController = null)
}

