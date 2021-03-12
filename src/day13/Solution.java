package day13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author luqiqi
 * @create 2021-03-07-22:50
 */
public class Solution {

    static int[] arr = new int[4];

    static Scanner scanner = new Scanner(System.in);
    static int index;


    public static void main(String[] args) {

        System.out.println("请输入目标值");
        index = scanner.nextInt();

        Solution solution = new Solution();

        int target = solution.searchInsert(arr, index);


        System.out.println("返回结果为" + target);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入数组的元素值");
            nums[i] = scanner.nextInt();
        }
        System.out.println("输入完毕");
        Arrays.sort(nums);

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < target) {
                index = j + 1;
            } else {
                return index;
            }
        }
        return nums.length;
    }


}



