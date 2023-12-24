package com.example.navigationincompose

import android.os.*
import kotlinx.parcelize.*

@Parcelize
data class Person(
		val firstName: String,
		val secondName: String
                 ) : Parcelable
