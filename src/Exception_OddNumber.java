public class Exception_OddNumber {
  public static void main(String[] args) {
	//TODO:  Try at least 6 different numbers of different lengths
    int n = 18;
    trynumber(n);
    n = 7;
    trynumber(n);
  }

  //TODO: Use Exception catching to figure out if the number is even or odd
  //and print out if it is even or odd.
  public static void trynumber(int n) {
      checkEvenNumber(n);
  }

  //TODO: Throw an exception if odd
  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      System.out.println(number + " is odd.");
    }
  }
}