class Disk(title:String, cost:Float, year:Int, gender:String,group:String,stock:Int):Product(title, cost,year) {
    var gender = gender
        get():String {
            return field
        }
        set(valor:String){
            while(valor !in listOfGenders) {
                println("Género no reconocido, introduzca uno nuevo o añada el género a la lista")
                this.gender = readln().toString()
                if (valor in listOfGenders){
                    field = valor
                    break
                }
            }
        }
    var group = group
    var stock = stock
        get():Int {
            return field
        }
    var listOfGenders: MutableList<String> = mutableListOf("rock","pop","indie")
}