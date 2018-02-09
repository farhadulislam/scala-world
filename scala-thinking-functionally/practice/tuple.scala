/* simple ways to create tuple and use it */

val personInfo =("Farhad", "S Developer", 31, "M")
val genderPair = "Farhad"->"m"

personInfo.productIterator.forEach(i=>println(i))
personInfo._1 // object._1 notation is used to access personInfo's first element