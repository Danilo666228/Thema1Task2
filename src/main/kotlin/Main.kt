fun main()
{
    print("Введите строку из букв: ")
    var inputText = readln()
    var array = IntArray(256)
    for(i in inputText){
        array[i.toInt()]++
    }
    for(j in 'A'.toInt()..'Z'.toInt())
    {
        if (array[j]>0){
            println("${j.toChar()}-${array[j]}")
        }
    }
    for(c in 'a'.toInt()..'z'.toInt())
    {
        if (array[c]>0){
            println("${c.toChar()}-${array[c]}")
        }
    }
}