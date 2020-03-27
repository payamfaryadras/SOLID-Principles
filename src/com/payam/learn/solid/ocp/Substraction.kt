package com.payam.learn.solid.ocp

class Substraction(private val firstOperand: Double, private val secondOperand: Double):IOperation {


    override fun performOperation(): Double {
      return firstOperand.minus(secondOperand)
    }
}