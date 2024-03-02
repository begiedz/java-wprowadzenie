public class zajecia2 {
  public static void main (String[] args){
    excerciseOne(5,8);
    excerciseTwo(new int[]{5,2,1});
    excerciseThree(6);
    excerciseFour(80,1.78);
    excerciseFive(new int[]{5,4,5,3,2,3,5,6});
    excerciseSix("kajak");
  }

// Zadanie 1
  public static void excerciseOne(int firstNumber, int secondNumber) {
    System.out.println("Zadanie 1:");

    System.out.println(firstNumber + secondNumber);
    System.out.println(firstNumber - secondNumber);
    System.out.println(firstNumber * secondNumber);
    System.out.println(firstNumber / secondNumber);
  }

  // Zadanie 2
  public static void excerciseTwo(int[] numbers) {
    if (numbers.length > 0){
      double sum = 0;
      for (int i = 0; i < numbers.length; i++){
        sum += numbers[i];
      }

      double avarage = sum / numbers.length;
      
      System.out.println("Zadanie 2:");
      System.out.println(avarage);
      }
    }
  
  // Zadanie 3
  public static void excerciseThree(int number) {
    System.out.println("Zadanie 3:");

    if (number % 2 == 0){
      System.out.println("Liczba " + number + " jest parzysta");
    } else {
      System.out.println("Liczba " + number + " nie jest parzysta");
    }
  };

  // Zadanie 4
  public static void excerciseFour(int weight, double height) {
    double bmi = weight / height;
    System.out.println("Zadanie 4:");
    System.out.println(bmi);
  };

  // Zadanie 5
  public static void excerciseFive(int[] marks) {
    if (marks.length > 0){
      double sum = 0;
      for (int i = 0; i < marks.length; i++){
        sum += marks[i];
      }
      double avarage = sum / marks.length;

      System.out.println("Zadanie 5:");
      if (avarage >= 6){
        System.out.println("A");

      } else if (avarage >= 5) {
        System.out.println("B");

      } else if (avarage >= 4) {
        System.out.println("C");

      } else if (avarage >= 3) {
        System.out.println("D");

      } else if (avarage >= 2) {
        System.out.println("E");

      } else {
        System.out.println("F");
      }     
    }
  }

  // Zadanie 6
  public static void excerciseSix(String word){
    String reversedWord = new StringBuilder(word).reverse().toString();
    System.out.println("Zadanie 6:");
    if(word.equals(reversedWord)){
      System.out.println("Słowo " + word + " jest palindromem");
    } else {
      System.out.println("Słowo " + word + " nie jest jest palindromem");
    }
  }
}