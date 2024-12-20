package com.dsw.pam.curse_off.view.wallet

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dsw.pam.curse_off.view_model.WalletViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun WalletScreen(
    viewModel: WalletViewModel = koinViewModel(),
    onBackClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Portfel ${viewModel.injectedDoubleExample}",
            fontSize = 24.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {
            viewModel.saveWalletAmount(newAmount = 100.0)
        }) {
            Text(text = "Zapisz nową wartość")
        }

        Button(
            onClick = onBackClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
        ) {
            Text("Wstecz")
        }
    }
}


