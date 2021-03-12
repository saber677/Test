package day13;

import java.util.Scanner;

/**
 * @author luqiqi
 * @create 2021-03-11-0:10
 */
public class
Test {
    static int[] arr = new int[4];

    static Scanner scanner = new Scanner(System.in);
    static int index=scanner.nextInt();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.searchInsert(arr,index);
    }
}
