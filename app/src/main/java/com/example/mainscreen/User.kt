package com.example.mainscreen

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var name : String = "",
    var age : Int = 0
): Parcelable
