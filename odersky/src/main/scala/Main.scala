import Collections.lst_

object Main extends App {
//  println(first_steps_chapter)
//  println(Functions.num_0(2))
//  println(Functions.addTwo(2))
  println(Collections.lst_.map(x => x + 2))
  println(lst_.map(_ + 2))
  println(lst_.filter(x => x % 2 == 1))
  println(lst_.reduce((x, y) => x + y))
  println(lst_.reduce(_ + _))
  println(lst_.sum)
}
