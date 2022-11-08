package homework15;

public class Main {
    static boolean rezultat = true;

    public static void main(String[] args) {

        System.out.println(sumNumbers(50));

        System.out.println(sumEvenNumbers(6));
        System.out.println(sumEvenNumbers(7));

        System.out.println(isPalindrom("ana"));

    }

    //1) sum of first n integer numbers
    private static int sumNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNumbers((n - 1));
    }

    //sum of first n EVEN integers
    private static int sumEvenNumbers(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumEvenNumbers(n - 2);
        } else {
            return sumEvenNumbers(n - 1);
        }

    }

    //Palindrome: a word that reads the same backwards as forwards, e.g. madam or ana
    private static boolean isPalindrom(String termen) {
        if (termen == null) {
            return false;
        }
        if (termen.length() == 1 || termen.length() == 0) {
            return true;
        } else {
            if (termen.substring(0,1).equals(termen.substring(termen.length()-2,1))){
                //rezultat=true;
                return isPalindrom(termen.substring(1,termen.length()-3));
            }else {
                return false;
            }

        }

    }


}
