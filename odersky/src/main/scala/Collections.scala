object Collections {
  val lst_ = List(1, 2, 3)
  // foreach
  lst_.foreach(x => println(x)) // prints 1, 2, 3
  lst_.foreach(println) // same, prints 1, 2, 3
  // map
  lst_.map(x => x + 2) // returns a new List(3, 4, 5)
  lst_.map(_ + 2) // same
}
