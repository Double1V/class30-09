# class30-09

## kata task1

[Task link](https://www.codewars.com/kata/56606694ec01347ce800001b)    
My solution

    class TriangleTester{
      public static boolean isTriangle(int a, int b, int c){
        if (a + b <= c) return false;
        if (a + c <= b) return false;
        if (c + b <= a) return false;
      return true;
     }
    }
My fav soluiton

    class TriangleTester{
      public static boolean isTriangle(int a, int b, int c){
      return a + b > c && a + c > b && c + b > a;
      }
    }
## kata task2

[Task link](https://www.codewars.com/kata/54ff3102c1bad923760001f3)    
My solution

    public class Vowels {

      public static int getCount(String str) {
        int length = str.length();
        int counter = 0;
        for (int i = 0; i < length; ++i) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
                counter++;
            }
        }
        return counter;
      }

    }
My fav solution

    public class Vowels {

      public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
      }

    }
