class PizzaMoscow(neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
                  sicilianPizzaPrice: Double,  tyroleanPizzaPrice: Double
):PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {

    override fun ShowCheckPhoto() {
        println("У вас есть фото чека?")
        println("1. Да\n2. Нет")
        if (readln().toString().toInt() == 1) println("С вас 200 рублей")
    }

    override fun neapolitanPizzaSale() {
        println("Спасибо за покупку неополитической пиццы в Санкт-Петербурге")
        neapolitanPizzaCount++
    }

    override fun romanPizzaSale() {
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
        romanPizzaCount++
    }

    override fun sicilianPizzaSale() {
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
        sicilianPizzaCount++
    }

    override fun tyroleanPizzaSale() {
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
        tyroleanPizzaCount++
    }
}