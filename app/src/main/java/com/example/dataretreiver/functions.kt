package com.example.dataretreiver

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun design(state: stateViewModel) {
    
    Column(
        
    ) {

            TopAppBar(title ={ Text(text="Profile") },
                        colors = TopAppBarDefaults.smallTopAppBarColors(
                            containerColor = Color.LightGray
                        )
                )


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            TextField(
                value = state.name.value,
                onValueChange = {
                    state.name.value = it
                    state.finalname.value
                },
                label = {Text(text="Name")}
            )

            TextField(
                value = state.age.value,
                onValueChange = {
                    state.age.value = it
                    state.finalage.value
                },
                label = {Text(text="Age")}
            )


            TextField(
                value = state.clas.value,
                onValueChange = {
                    state.clas.value = it
                    state.finalclas.value
                },
                label = {Text(text="Class")}
            )


            TextField(
                value = state.address.value,
                onValueChange = {
                    state.address.value = it
                    state.finaladdress.value
                },
                label = {Text(text="Address")}
            )
            
            Spacer(modifier =Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            )
            {

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Save")
                }
            }


        }
    }
}