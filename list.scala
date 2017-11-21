val days1 = List("Mon", "Tues", "Wed")
val days2 = List("Thurs", "Fri", "Sat")
val weekDays1 = days1 ++ days2
val weekDays2 = days2 ::: days2
val weekDays3 = List(days1, days2).flatten
val firstElement = weekDays1.head // returns first element of a List
val lastElement =  weekDays1.tail
val sizeOfList = weekDays1.size

val isMonDayIn = weekDays1.contain("Mon")

//for loop on a List
for (x <- weekDays1) println(x)
