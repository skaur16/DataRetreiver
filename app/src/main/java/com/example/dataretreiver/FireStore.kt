package com.example.dataretreiver

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FireStore {
    val push = Firebase.firestore

    fun push1(name:String,
              age:String,
              clas:String,
              address:String
              ){

        val x = hashMapOf(
            "Name" to name,
            "Age" to age,
            "Class" to clas,
            "Address" to address
        )

        push.collection("Data")
            .document("Students")
            .set(x)
    }


}