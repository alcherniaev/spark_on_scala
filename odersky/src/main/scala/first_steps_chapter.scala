object first_steps_chapter {

  // functions
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  // if we don't use recursion, we can write func without defining an output type
  def max_1(x: Int, y: Int) = if (x > y) x else y

  var str_ = List("Concise", "is", "nice")
  str_.foreach(println)

  // kew-word new creates Class. [] - type, () - length
  val greetStrings = new Array[String](3)
  // same, but more concrete
  val greetStrings_ : Array[String] = new Array[String](3)

  // lists
  val one_two = List(1, 2)
  val three_four = List(3, 4)

  // list concatenation by :::
  val one_two_three_four = one_two ::: three_four
  println(one_two + " and " + three_four + " were not mutated")
  println("Thus, " + one_two_three_four + " is a new list")

  // add x to a list as a first element
  val x_three_four = "x" :: three_four
  println(x_three_four)

  // create ampty list
  val a_null = Nil
  val a_null_ = List()

  // get a third element of list
  one_two_three_four(2)

  // create new list and count the number of el with length = 4
  val thrill = "Will" :: "fill" :: "until" :: Nil
  thrill.count(el => el.length == 4)

  // delete first 2 el from a list and last
  thrill.drop(2)
  thrill.dropRight(2)

  // check if el exists in list
  thrill.exists(el => el == "untill")

  // filtering
  thrill.filter(el => el.length > 2)

  // forall checking return bul
  thrill.forall(el => el.endsWith("l"))

  // foreach 2 options do the same
  thrill.foreach(println)
  thrill.foreach(el => println(el))

  // first and last elements
  thrill.head
  thrill.last

  // returns all element but the last / first
  thrill.init
  thrill.tail

  // empty or not (true/false)
  thrill.isEmpty

  //length
  thrill.length

  // map. do smt with each element in list
  thrill.map(el => el + "y")

  // returns el besides filtering
  thrill.filterNot(el => el.length == 4)

  // reverse
  thrill.reverse

  // sorting
  thrill.sorted

  // make strings! if i print, it returns elements as a string, not a list(el1, el2, el3). just el1, el2, el3
  val str = thrill.mkString(", ")
  println(thrill)
  println(str)

  // tuple. access to first element is ._1, not 0. allow to contain any type (Int, Str, etc)
  var pair = (99,  "Luftballons")
  println(pair)
  println(pair._1)
  println(pair._2)

  // Set can be mutable and immutable
  //immutable
  var jet_set = Set("Boeing", "Airbus")
  jet_set += "Bombardier" // return a new jet_set
  println(jet_set)
  println(jet_set.contains("Sukhoy"))
  // mutable requires importing
  import scala.collection.mutable
  val movie_set = mutable.Set("Hitch", "Poltergeist")
  movie_set += "Shrek"
  println(movie_set)

  // HashSet
  import scala.collection.immutable.HashSet
  val hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")

  // Map mutable
  import scala.collection.mutable
  val treasure_map = mutable.Map[Int, String]()
  treasure_map += (1 -> "Go to island")
  treasure_map += (2 -> "Find big X on ground")
  treasure_map += (3 -> "Dig")
  println(treasure_map(2))
  // Map immutable
  val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
  println(romanNumeral(4))

  // reading files
  import scala.io.Source
  val lines = Source.fromFile("/Users/alcherniaev/IdeaProjects/test_spark/odersky/some_example.txt").getLines().toList
  println(lines)
  // reduceLeft apply func to first 2 elements, then for this result and third etc
  val longest_line = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
  println(longest_line)
}
