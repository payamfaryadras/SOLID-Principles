package com.payam.learn.solid.ocp

class Addition(private val firstOperand: Double, private val secondOperand: Double) : IOperation {


    override fun performOperation(): Double {
        return firstOperand.plus(secondOperand)

    }
}