package com.example.dataretreiver

import android.util.Log
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
                    state.finalname.value = state.name.value
                },
                label = {Text(text="Name")}
            )

            TextField(
                value = state.age.value,
                onValueChange = {
                    state.age.value = it
                    state.finalage.value = state.age.value
                },
                label = {Text(text="Age")}
            )


            TextField(
                value = state.clas.value,
                onValueChange = {
                    state.clas.value = it
                    state.finalclas.value = state.clas.value
                },
                label = {Text(text="Class")}
            )


            TextField(
                value = state.address.value,
                onValueChange = {
                    state.address.value = it
                    state.finaladdress.value = state.address.value
                },
                label = {Text(text="Address")}
            )
            
            Spacer(modifier =Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            )
            {

                Button(onClick = {
                    Log.d("before name",state.finalname.value.toString())

                    state.func()
                    state.flag.value = 1

                }) {
                    Text(text = "Save")
                }
            }

            if(state.flag.value ==1){
                Show(state)
            }


        }
    }
}

@Composable
fun Show(state:stateViewModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text="Name:")
            Text(state.finalname.value)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text="Age:")
            Text(state.finalage.value)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text="Class:")
            Text(state.finalclas.value)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text="Address:")
            Text(state.finaladdress.value)
        }
    }
}