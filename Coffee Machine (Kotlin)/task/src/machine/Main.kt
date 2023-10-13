package machine



fun main() {
    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val machTask = readln()
        CoffeeMachine.operateMach(machTask)
    } while (machTask != "exit")
}
