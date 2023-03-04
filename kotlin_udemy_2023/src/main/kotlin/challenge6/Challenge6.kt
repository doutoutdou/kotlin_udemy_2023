package challenge6

import challenge6.javacode.Employee

fun main(args: Array<String>) {
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)
}