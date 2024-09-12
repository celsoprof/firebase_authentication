package br.dev.celso.makeitso.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.celso.makeitso.ui.theme.guerrilla
import br.dev.celso.makeitso.ui.theme.roboto

@Composable
fun LoginScreen() {

    var emailState by remember {
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF012637)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(32.dp)
            ) {
                Text(
                    text = "LOGIN",
                    fontSize = 48.sp,
                    color = Color.Yellow,
                    fontWeight = FontWeight.Normal,
                    fontFamily = guerrilla,
                )
                Text(
                    text = "Identifique-se no sistema",
                    fontSize = 20.sp,
                    color = Color(0xFF8874E9),
                    fontFamily = roboto
                )
                Spacer(modifier = Modifier.height(64.dp))
                OutlinedTextField(
                    onValueChange = {
                        emailState = it
                    },
                    value = emailState,
                    modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
                    label = {
                        Text(text = "Informe seu e-mail")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "")
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.Yellow
                        )
                )
                OutlinedTextField(
                    onValueChange = {
                        senhaState = it
                    },
                    value = senhaState,
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Informe sua senha")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "")
                    },
                    trailingIcon = {
                        Icon(imageVector = Icons.Default.Clear, contentDescription = "")
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.Yellow
                        )
                )
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().height(48.dp)
                ) {
                    Text(text = "ENTRAR")
                }
                Spacer(modifier = Modifier.height(32.dp))
                Text(
                    text = "Criar conta",
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {  },
                    textAlign = TextAlign.End,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}