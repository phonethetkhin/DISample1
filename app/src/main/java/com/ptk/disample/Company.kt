package com.ptk.disample

class Company constructor(val companName: String, val employee: Employee) {
    fun showEmployeeName() {
        println("Employee ${employee.name} is from the ${companName} Company")
    }
}