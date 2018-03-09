def sayHello(name: String )(implicit myself: String) ={
  s"Hello $name! My name is $myself"
}


implicit val myString = "implicits"

val fast = sayHello("test")
// omitted the second parameter as Scala automatically passes the implicit to the function
//Note - Use of implicit is limited to scope