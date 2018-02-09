val answer = if(3/3 != 0 )0 else 1
println(answer)
for(x<-1 to 100)println(x)
val weekDays = List("Mon", "Tues", "Wed","Thurs", "Fri", "Sat")
weekDays.forEach(println(_))
weekDays.map(_=="Mon")
val days1 = List("Mon", "Tues", "Wed")
val days2 = List("Thurs", "Fri", "Sat")
val weekDays1 = days1 ++ days2
val weekDays2 = days2 ::: days2
val weekDays3 = List(days1, days2).flatten
val firstElement = weekDays1.head // returns first element of a List
val lastElement =  weekDays1.tail
val sizeOfList = weekDays1.size

val isMonDayIn = {
 weekDays1.contains("Mon")
}

//for loop on a List
for (x <- weekDays1) println(x)

def min(x:Int,y :Int): Int = if x<y x else y

println()

//
