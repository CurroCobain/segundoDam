abstract class Cliente() {

    abstract fun discountYes(product:Product):Int
    abstract fun pay(money:Float):Boolean
}