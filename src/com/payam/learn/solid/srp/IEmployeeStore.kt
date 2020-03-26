package com.payam.learn.solid.srp

interface IEmployeeStore {

    fun getEmployeeById(id:Int):Employee
    fun addEmployee(employee: Employee):Boolean
}