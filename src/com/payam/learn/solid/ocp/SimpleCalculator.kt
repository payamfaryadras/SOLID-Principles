package com.payam.learn.solid.ocp

class SimpleCalculator:ICalculator {
    override fun calculate(operation: IOperation) {
        operation.performOperation();
    }
}