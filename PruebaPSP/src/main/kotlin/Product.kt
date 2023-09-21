open class Product(title:String, cost:Float,year:Int) {
    var title = title
        get():String {
            return field
        }
    var cost = cost
        get():Float {
            return field
        }
        set(valor:Float){
            if (valor>0){
                field=valor
            }
        }
    var year = year
        get():Int {
            return field
        }
        set(valor:Int){
            if (valor>1900){
                field=valor
            }
        }
    var discount = 0

    fun getDiscount(){
        println("Indique el descuento que quiere añadir al producto:")
        this.discount= readln().toInt()
    }
}