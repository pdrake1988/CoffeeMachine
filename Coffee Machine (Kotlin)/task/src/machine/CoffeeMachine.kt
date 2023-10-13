package machine

import kotlin.math.abs

class CoffeeMachine {
    companion object {
        private var machWater: Int = 400
        private var machMilk: Int = 540
        private var machCoffee: Int = 120
        private var machCups: Int = 9
        private var machMoney: Int = 550

        fun operateMach(machTask: String) {
                when (machTask) {
                    "buy" -> {
                        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                        val order = readln()
                        when (order) {
                            "1" -> {
                                orderEspresso(250, 16)
                            }
                            "2" -> {
                                orderLatte(350, 75, 20)
                            }
                            "3" -> {
                                orderCappucino(200, 100, 12)
                            }
                        }
                    }
                    "fill" -> fill()
                    "take" -> take()
                    "remaining" -> remaining()
                }
        }


        private fun fill() {
            println("Write how many ml of water you want to add:")
            machWater += readln().toInt()
            println("Write how many ml of milk you want to add:")
            machMilk += readln().toInt()
            println("Write how many grams of coffee beans you want to add:")
            machCoffee += readln().toInt()
            println("Write how many disposable cups you want to add:")
            machCups += readln().toInt()
        }

        private fun take() {
            val moneyTaken = abs(machMoney)
            machMoney -= moneyTaken
            println("I gave you \$$moneyTaken")
        }

        private fun remaining() {
            println("The coffee machine has:")
            println("$machWater ml of water")
            println("$machMilk ml of milk")
            println("$machCoffee g of coffee beans")
            println("$machCups disposable cups")
            println("\$$machMoney of money")
        }
        private fun orderEspresso(waterNeeded: Int, coffeeNeeded: Int) {
            if (coffeeNeeded > machCoffee) {
                println("Sorry, not enough coffee!")
            } else if (waterNeeded > machWater) {
                println("Sorry, not enough water!")
            } else {
                println("I have enough resources, making you a coffee!")
                machWater -= waterNeeded
                machCoffee -= coffeeNeeded
                machCups--
                machMoney += 4
            }
        }
        private fun orderLatte(waterNeeded: Int, milkNeeded: Int, coffeeNeeded: Int) {
            if (waterNeeded > machWater) {
                println("Sorry, not enough water!")
            } else if (milkNeeded > machMilk) {
                println("Sorry, not enough milk!")
            } else if (coffeeNeeded > machCoffee) {
                println("Sorry, not enough coffee!")
            } else {
                println("I have enough resources, making you a coffee!")
                machWater -= waterNeeded
                machMilk -= milkNeeded
                machCoffee -= coffeeNeeded
                machCups--
                machMoney += 7
            }
        }
        private fun orderCappucino(waterNeeded: Int, milkNeeded: Int, coffeeNeeded: Int) {
            if (waterNeeded > machWater) {
                println("Sorry, not enough water!")
            } else if (milkNeeded > machMilk) {
                println("Sorry, not enough milk!")
            } else if (coffeeNeeded > machCoffee) {
                println("Sorry, not enough coffee!")
            } else {
                println("I have enough resources, making you a coffee!")
                machWater -= waterNeeded
                machMilk -= milkNeeded
                machCoffee -= coffeeNeeded
                machCups--
                machMoney += 6
            }
        }
    }
}
