 import java.util.ArrayList;
 import java.util.List;
 public class AutoboxingExample
 { public static void main(String[] args) {
 String[] numberStrings = {"10", "20", "30", "40", "50"};
 List<Integer> numbers =parseStringArrayToIntegers(numberStrings);
 int sum = calculateSum(numbers);
 System.out.println("The sum of the numbers is: " + sum);
 }
 public static List<Integer> parseStringArrayToIntegers(String[] strings)
 { List<Integer> integerList = new ArrayList<>();
 for (String str : strings)
 { integerList.add(Integer.parseInt(str)
 );
 }
 return integerList;
 }
 public static int calculateSum(List<Integer> numbers)
 { int sum = 0;
 for (Integer num : numbers)
 { sum += num;
 }
 return sum;
 }
 }