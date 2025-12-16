abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
) {
    var lastPizzaType: PizzaType? = null
    var coffeeWithNeapolitan = 0
    var coffeeWithRoman = 0
    var coffeeWithSicilian = 0
    var coffeeWithTyrolean = 0
    var countsauce1 = 0
    var sumsauce1 = 0
    var sumsuace = 0
    var countsauce = 0
    var peopleYESP = 0
    var peopleNOP = 0
    var peopleNO = 0
    var peopleYES = 0
    var countcoffe = 0
    var sumcoffee = 0.00
    var sum = 0.00
    var countsale = 0
    var checks = 0
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    fun showStatistics(){
        println("Продано сицилийских пицц $sicilianPizzaCount")
        println("Продано римских пицц $romanPizzaCount")
        println("Продано неапольских пицц $neapolitanPizzaCount")
        println("Продано тирольских пицц $tyroleanPizzaCount")

        val money = neapolitanPizzaCount * neapolitanPizzaPrice +
                romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice +
                tyroleanPizzaCount * tyroleanPizzaPrice +
                sumcoffee - sum
        println("------------------------------------------------------------")
        println("Всего заработано денег: $money ")
        println("------------------------------------------------------------")
        if(this is CheckPhoto) {
            println("------------------------------------------------------------")
            println("Общее количество чеков: $checks  общая сумма скидок: $sum")
            println("------------------------------------------------------------")
            println("Сколько человек показывает фотографию чека: показывают ${peopleYES*0.01} %, не показывают ${peopleNO*0.01} %")
            println("------------------------------------------------------------")
        }
        if(this is Drink){
            println("---------статистика проданного кофе к каждой пицце----------")
            val totalCoffe = coffeeWithNeapolitan+coffeeWithTyrolean+coffeeWithRoman+coffeeWithSicilian
            if(totalCoffe == 0){
                println("Кофе к пицце пока не покупали")
            }
            else{
                println("К неаполитанской пицце: $coffeeWithNeapolitan раз (${coffeeWithNeapolitan * 100/totalCoffe}%)")
                println("К римской пицце: $coffeeWithRoman раз (${coffeeWithRoman* 100/totalCoffe}%)")
                println("К сицилийской пицце: $coffeeWithSicilian раз (${coffeeWithSicilian* 100/totalCoffe}%)")
                println("К римской пицце: $coffeeWithTyrolean раз (${coffeeWithTyrolean * 100/totalCoffe}%)")


            }
            println("------------------------------------------------------------")
            println("Общее количество проданного кофе: $countcoffe общая выручка проданного кофе: $sumcoffee")
            println("------------------------------------------------------------")
            println("Сколько человек покупает кофе: покупают ${peopleYESP*0.01} %, отказываются ${peopleNOP*0.01} %")
            println("------------------------------------------------------------")
        }

        if(this is Sauce) {
            println("------------------------------------------------------------")
            println("Общее количество проданного срыного соуса:$countsauce общая выручка проданного сырного соуса: $sumsuace")
            println("------------------------------------------------------------")
            println("Общее количество проданного кислосладкого соуса:$countsauce1 общая выручка проданного кислосладкого соуса: $sumsauce1")
            println("------------------------------------------------------------")
        }
    }
}