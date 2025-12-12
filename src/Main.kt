import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val pizzaPiter = PizzaPiter(175.0, 241.5,
        167.5, 215.0)
    val pizzaMoscow = PizzaMoscow(215.0, 250.5,
        180.5, 240.0)
    var currentPizzaCity:PizzaCity

    while (true)
    {
        println("Добрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербур\n0. Выход из программы\n")
        when (checkCom(0, 2)) {
            1 -> currentPizzaCity = pizzaMoscow
            2 -> currentPizzaCity = pizzaPiter
            0 -> break
            else -> {
                println("ERROR")
                continue
            }
        }

        println("Выберите пиццу:")
        println("1. Неополитическая пицца\n2. Римская пицца \n3. Сицилийская пиццы \n4. Тирольская пицца\n0. Показать статистику\n")
        selectPizza(currentPizzaCity)


    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    when (checkCom(0, 4)) {
        1 -> {
            currentPizzaCity.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        2 -> {
            currentPizzaCity.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        3 -> {
            currentPizzaCity.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        4 -> {
            currentPizzaCity.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

fun selectAddService(currentPizzaCity: PizzaCity)
{
    when (currentPizzaCity) {
        is CheckPhoto -> currentPizzaCity.ShowCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
    }
}

fun  checkCom( first:Int,second:Int): Int{
    var numString = readln();
    var num=0
    var flagStr = false
    var flag3 = false
    while (!flagStr && !flag3) {
        if (numString.toIntOrNull() != null) {
            num = numString.toInt()
            flagStr = true
            if (num > second || num < first) {
                println("Введите корректное значение")
                numString = readln()
                flagStr = false
                flag3 = false
            }
            else
                flag3=true
        } else {
            println("Введите корректное значение")
            numString = readln()
            flagStr = false
            flag3 = false
        }
    }
    return num
}

