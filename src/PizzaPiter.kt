class PizzaPiter(neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
                  sicilianPizzaPrice: Double,  tyroleanPizzaPrice: Double
):PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
),Drink {

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln().toString().toInt() == 1){
            println("С вас 200 рублей")
            sumcoffee+=200
            countcoffe++
            peopleYESP++
            when(lastPizzaType){
                PizzaType.NEAPOLIAN -> coffeeWithNeapolitan++
                PizzaType.ROMAN -> coffeeWithRoman++
                PizzaType.SICILIAN -> coffeeWithSicilian++
                PizzaType.TYROLAEN -> coffeeWithTyrolean++
                else -> {
                    println("Кофе без пиццы не учитывается в статистике")
                }
            }

        }
        else {
            peopleNOP++
        }
    }
    override fun neapolitanPizzaSale() {
        println("Спасибо за покупку неополитической пиццы в Санкт-Петербурге")
        neapolitanPizzaCount++
        lastPizzaType = PizzaType.NEAPOLIAN
    }

    override fun romanPizzaSale() {
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
        romanPizzaCount++
        lastPizzaType = PizzaType.ROMAN
    }

    override fun sicilianPizzaSale() {
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
        sicilianPizzaCount++
        lastPizzaType = PizzaType.SICILIAN
    }

    override fun tyroleanPizzaSale() {
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
        tyroleanPizzaCount++
        lastPizzaType = PizzaType.TYROLAEN
    }
}