package com.ptk.disample

data class Hobbies(val hobbiesList: List<HobbiesModel>)

data class HobbiesModel(val hobbyName: String, val passionateLevel: Int)