
fun fibonacci(a: Int): Int{
    if (a <= 2){
        return 1
    }
    return fibonacci(a-1) + 
    fibonacci(a-2)
}


fun media_variavel(): Double{
    val lista: MutableList<Int> = mutableListOf()
    lista.add(1)
    lista.add(2)
    lista.add(3)
    lista.add(4)
    lista.add(5)
    var total = 0.0
    for(e in lista){
        total += e
    }

    return (total / lista.size)
}


fun main(){
    print(media_variavel())
}