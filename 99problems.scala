// Find the last element of a list 
// last(List(1,1,2,3,5,8)
// http://aperiodic.net/phil/scala/s-99/ 

object scalaTests {
    def main(args:Array[String]) { 
      testP1()
      testP2()
      testP3()
      testP4()   
      testP5()
    }

    // here is exercise 1
    def testP1() {
        val testList = List(1,1,2,3,5,8)
        val test = last(testList)
        assert(test == 8)
    }
    def last[A] (ls: List[A]): A = ls.reverse.head


    // here is exercise 2
    def testP2() {
        val testList = List(1,1,2,3,5,8)
        val test = lastButOne(testList)
        assert(test == 5)
    }
    def lastButOne[A] (ls: List[A]): A = ls(ls.size-2) 
    
    // exercise 3
    def testP3() {
        val testList = List(1,1,2,3,5,8)
        val testInt = 2
        val test = findKthElement(testInt,testList)
        assert(test == 2)
        }

    def findKthElement[A] (a:Int, b:List[A]): A = b(a)

    // exercise 4
    def testP4() {
        val testList = List(1,1,2,3,5,8)
        val test = length(testList)
        assert(test == 6)
    }

    def length[A] (ls: List[A]): Int = ls.size

    // exercise 5
    def testP5() {
        val testList = List(1,1,2,3,5,8)
        val test = reverse(testList)
        assert(test == testList.reverse)

    }

    def reverse[A] (ls: List[A]): List[A] = ls.reverse

   // exercise 6
   def testP6() {
       val testList = List(1,2,3,2,1)
       val test = isPalindrome(testList)
       assert(test == test)
   }

  def isPalindrome[A] (ls: List[A]): Boolean = {
      ls == ls.reverse 
  }










}

