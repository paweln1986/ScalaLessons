import scala.annotation.tailrec

/**
 * Created by paweln1986 on 05.08.14.
 */
object ReverseList extends App {
  var testList = List(1,2,3,4,5)
  testList.reverse
  @tailrec
  def reverseList(l:List[Any], tmp:List[Any] = Nil):List[Any] = l match{
      case xs::x => reverseList(x, xs::tmp)
      case _ => tmp
  }
}
