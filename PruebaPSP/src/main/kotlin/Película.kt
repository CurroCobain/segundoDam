class Película(title:String, cost:Float, year:Int, gender:String,director:String,stock:Int):Product(title, cost,year) {
    var gender = gender
        get():String {
            return field
        }
        set(valor:String){
            while(valor !in movielistOfGenders) {
                println("Género no reconocido, introduzca uno nuevo o añada el género a la lista")
                this.gender = readln().toString()
                if (valor in movielistOfGenders){
                    field = valor
                    break
                }
            }
        }
    var director = director
    var stock = 1
        get():Int {
            return field
        }
    var movielistOfGenders: MutableList<String> = mutableListOf("comedia","terror","romántica")
}