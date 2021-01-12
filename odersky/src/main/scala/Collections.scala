object Collections {
  val lst_ = List(1, 2, 3)
  // foreach
  lst_.foreach(x => println(x)) // prints 1, 2, 3
  lst_.foreach(println) // same
  // map
  lst_.map(x => x + 2) // returns a new List(3, 4, 5)
  lst_.map(_ + 2) // same
  // filter
  lst_.filter(x => x % 2 == 1) // returns a new List(1, 3)
  lst_.filter(_ % 2 == 1) // same
  // reduce
  lst_.reduce((x, y) => x + y) // returns 6
  lst_.reduce(_ + _) // same
  lst_.sum // same

}
