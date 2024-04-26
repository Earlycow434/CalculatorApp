package com.example.composecalculator

sealed class CalculatorAction {
    data class number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    object Sign: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}