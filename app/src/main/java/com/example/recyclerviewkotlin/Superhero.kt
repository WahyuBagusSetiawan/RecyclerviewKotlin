package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable