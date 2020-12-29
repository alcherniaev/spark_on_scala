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



}
