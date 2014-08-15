package others

import scala.annotation.tailrec

/**
 * Created by paweln1986 on 05.08.14.
 */
object ConvertToBinary extends App{
  println(convert2b(600000000))
  @tailrec
  def convert2b(numb:Int, tmp:String = ""):String = numb/2 match {
    case 0 => (numb%2)+tmp
    case x => convert2b(x, (numb%2)+tmp)
  }
}
