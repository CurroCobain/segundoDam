class RegisterdClient(name:String,surname:String,idcard:String,phone:String,amount:Float,discount:Int):Cliente() {
    protected var name = name
        get():String {
            return field
        }
    protected var surname = surname
        get():String {
            return field
        }
    protected var idcard = idcard
        get():String {
            return field
        }
    protected var amount = amount
        get():Float {
            return field
        }
    protected var phone = phone
        get():String {
            return field
        }
    var discount = 2
    override fun discountYes(product: Product): Int {
        return product.discount+this.discount
    }
    var toBuy:List<Product> = mutableListOf()

    override fun pay(money: Float): Boolean {
        var total = 0.0
        for(i in toBuy){
            total+=i.cost-(this.discountYes(i))
        }
        if (this.amount >= total){
            this.amount-= total.toFloat()
            return true
        }
        return false
    }
}