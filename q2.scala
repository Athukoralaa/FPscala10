object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
    val lengths = words.map(_.length)
    lengths.reduce((total, len) => total + len)
  }
  
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date","Isuru")
    val total = countLetterOccurrences(words)
    println(s"Total letter occurrences: $total")
  }
}
