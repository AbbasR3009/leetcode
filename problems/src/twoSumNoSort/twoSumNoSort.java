package twoSumNoSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twoSumNoSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number of inputs");
        int n = sc.nextInt();
        System.out.println("inputs");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution(a, 9)));

    }

    public static int[] solution(int[] a, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int difference = target - a[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }


}
