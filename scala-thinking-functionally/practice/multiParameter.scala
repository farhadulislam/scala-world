
def sayHello(name : String)(myself: String)= {
  s"Hello $name! My name is $myself"
}

val result = sayHello("Farhad")("Scala")

print(result)

def sayHello2(name : String)(whoAreYou: () => String ) = {

  s"Hello $name My name is ${whoAreYou()}"
}

def provideName() = {"Scala"}
val fast = sayHello("test")(provideName)

val faster = sayHello("Test") { () =>
  "Anonymous"
}