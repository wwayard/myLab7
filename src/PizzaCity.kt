abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
) {
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
                sicilianPizzaCount * neapolitanPizzaPrice+
                romanPizzaCount * romanPizzaPrice+
                tyroleanPizzaCount * tyroleanPizzaPrice
        println("Всего заработано денег: $money ")
    }
}