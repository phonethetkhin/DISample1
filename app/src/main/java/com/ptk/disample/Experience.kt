package com.ptk.disample

data class Experience(val expList: List<ExpModel>)

data class ExpModel(
    val companyName: String,
    val position: String,
    val workingDuration: String,
    val description: String,
)