package com.example.dataretreiver

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class stateViewModel :ViewModel() {
              var name = mutableStateOf("")
              var age = mutableStateOf("")
              var clas = mutableStateOf("")
              var address = mutableStateOf("")
              var finalname = mutableStateOf("")
              var finalage = mutableStateOf("")
              var finalclas = mutableStateOf("")
              var finaladdress = mutableStateOf("")
}