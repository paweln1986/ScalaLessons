import scala.annotation.tailrec

/**
 * Created by paweln1986 on 04.08.14.
 */
object Factorial extends App {
  val t1 = System.currentTimeMillis
  val s = factorial(100);
  val t2 = System.currentTimeMillis
  println((t2 - t1) + " msecs")

  @tailrec
  def factorial(x:Int, tmp:BigInt = 1):BigInt = {
    x match {
      case x if (x <= 0) => tmp
      case _ => factorial(x-1,tmp*x)
    }
  }

}

