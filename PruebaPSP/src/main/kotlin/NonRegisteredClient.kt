class NonRegisteredClient(toBuy:MutableList<Product>,amount:Float):Cliente() {
    var toBuy:List<Product> = mutableListOf()
    override fun discountYes(product: Product): Int {
        return product.discount
    }
    override fun pay(money: Float): Boolean {
        TODO("Not yet implemented")
    }

}