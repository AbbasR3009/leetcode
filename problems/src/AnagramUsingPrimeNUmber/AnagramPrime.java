package AnagramUsingPrimeNUmber;
import java.util.HashMap;
import java.util.Map;

public class AnagramPrime {

        private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
        private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        public static Map<Character, Integer> letterToPrimeMap;

        static {
            letterToPrimeMap = new HashMap<>();
            for (int i = 0; i < LETTERS.length(); i++) {
                letterToPrimeMap.put(LETTERS.charAt(i), PRIMES[i]);
            }
        }

        private static long productOfPrimes(String s) {
            long product = 1;
            for (char c : s.toLowerCase().toCharArray()) {
                product *= letterToPrimeMap.get(c);    // product = product * letterToPrimeMap.get(c);
            }
            return product;
        }

        public static boolean areAnagrams(String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false;
            }

            return productOfPrimes(word1) == productOfPrimes(word2);
        }

        public static void main(String[] args) {
            System.out.println(areAnagrams("Listen", "Silent")); // true

            System.out.println(areAnagrams("Hello", "World")); // false
        }
    }



