class PizzaMoscow(neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
                  sicilianPizzaPrice: Double,  tyroleanPizzaPrice: Double
):PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto {

    override fun ShowCheckPhoto() {
        println("У вас есть фото чека?")
        println("1. Да\n2. Нет")
        if (readln().toString().toInt() == 1) {
            println("Вам будет скидка 50 рублей с покупки")
            sum+=50
            checks++
            countsale++
            peopleYES++
        }
        else{
            peopleNO++
        }

    }

    override fun neapolitanPizzaSale() {
        println("Спасибо за покупку неополитической пиццы в Москве")
        neapolitanPizzaCount++
        lastPizzaType = PizzaType.NEAPOLIAN
    }

    override fun romanPizzaSale() {
        println("Спасибо за покупку римской пиццы в Москве")
        romanPizzaCount++
        lastPizzaType = PizzaType.ROMAN
    }

    override fun sicilianPizzaSale() {
        println("Спасибо за покупку сицилийской пиццы в Москве")
        sicilianPizzaCount++
        lastPizzaType = PizzaType.SICILIAN

    }

    override fun tyroleanPizzaSale() {
        println("Спасибо за покупку тирольской пиццы в Москве")
        tyroleanPizzaCount++
        lastPizzaType = PizzaType.TYROLAEN
    }
}