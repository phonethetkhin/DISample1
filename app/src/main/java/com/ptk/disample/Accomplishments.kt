package com.ptk.disample

data class Accomplishments(val accomplishmentsList: List<AccomplishmentsModel>)

data class AccomplishmentsModel(
    val accomplishmentName: String,
    val accomplishmentType: String,
    val duration: String,
    val description: String,
)