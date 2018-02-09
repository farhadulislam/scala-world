// code source : Martin Odersky 's book
import scala.collection.mutable

class ChecksumAccumulator {
  var sum = 0
}

//companion object (singleton object)
object ChecksumAccumulator{

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s:String): Int =
    if (cache.contains(s))
      cache(s) // why is cache being used like a method ? It's returning a mapped value
    else {
      val acc = new ChecksumAccumulator //initializes an instance
      for (c <-s ) // for expression cycles through string passed on
        acc.add(c.toByte) // converting each char to byte and passing it to method add of ChecksumAccumulator instance
      // which ass refers to
      val cs = acc.checksum() //Checksum is invoked on acc, which gets the String passed on, and stores it in
      // a val called cs
      cache += (s -> cs) // the passed string key is mapped to the integer checksum value, key-value pair is added
      // to the cache map
      cs // this line ensures the checksum is the result of the method.
    }
}