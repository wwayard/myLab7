class Zyza(
    neapolitanPizzaPrice: Double,
    romanPizzaPrice: Double,
    sicilianPizzaPrice: Double,
    tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice,
    romanPizzaPrice,
    sicilianPizzaPrice,
    tyroleanPizzaPrice
), CheckPhoto, Drink, Sauce{

   override fun sauceShow(){
       println("Вы будете брать соус к пицце? ")
       println("1. Да\n2. Нет")
       val choice = readln().trim()
       if(choice == "1"){
           println("1. Сырный\n2.Кислосладкий")
           val choice1 = readln().trim()
           if (choice1 == "1"){
               println("С вас 30 рублей")
               countsauce++
               sumsuace+=30
           }
           else{
               println("С вас 40 рублей")
               countsauce1++
               sumsauce1+=40
           }
       }
    }
    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        val choice = readln().trim()
        if (choice == "1") {
            println("С вас 200 рублей")
            countcoffe++
            sumcoffee += 200.0
            peopleYESP++
        }
        else {
            peopleNOP++
        }
    }
    override fun ShowCheckPhoto() {
        // Ваша реализация из предыдущего кода
        println("У вас есть фото чека?")
        println("1. Да\n2. Нет")
        val choice = readln().trim()
        if (choice == "1") {
            println("Вам будет скидка 50 рублей с покупки")
            sum += 50
            checks++
            countsale++
            peopleYES++
        }
        else{
            peopleNO++
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