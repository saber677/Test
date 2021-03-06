package day12;

import java.util.Scanner;

/**
 * @author luqiqi
 * @create 2021--02-22:15
 */
public class Solution {

    public static void main(String[] args) {

        //从键盘输入一个字母
        Scanner input = new Scanner(System.in);
        String character = input.next();

        //把创建的字母传给titleToNumber()方法，接收返回值
        int end = new Solution().titleToNumber(character);

        //输出结果
        System.out.println(end);

    }

    public int titleToNumber(String s) {
        //记录每次大写和小写的之和，因为每循环一次都要记录，所以要放在成员变量里，不能放在循环里
        int sum = 0;

        //把传进来的s 转成char[]类型数组
        char[] arr = s.toCharArray();

        //定义基准值
        int x = 0;
        //计算基准值
        for (int i = 1; i <= arr.length; i++) {
            x = (int) Math.pow(26, i - 1) + x;
        }

        //遍历传进来的数组
        for (int j = 0; j < arr.length; j++) {
            int big = 0;
            int small = 0;

            //用26个字母的字符集用i代替，去匹配数组的每个字符
            for (int i = 65; i < 91; i++) {
                //把字符集i转成String类型 去和传进来的s比较是否相等
                String tostring = String.valueOf((char) i);

                //判断是不是大写，是就进去
                if (Character.isUpperCase(arr[j])) {

                    //判断 传进来的值 和 字母的字符集i 是否相等
                    if (String.valueOf(arr[j]).equals(tostring)) {

                        //公式：记录传进来的s的每个字符对应excel的值
                        big = (int) ((i - 64 - 1) * (Math.pow(26, arr.length - j - 1)) + big);

                        //已经拿到匹配的值 中止循环
                        i = 91;
                    }
                }

                //输入的是小写的进去
                else {

                    //转成大写，再转成字符串去对比值是否相等
                    if (String.valueOf(Character.toUpperCase(arr[j])).equals(tostring)) {

                        //公式：记录传进来的s的每个字符对应excel的值
                        small = (int) ((i - 64 - 1) * (Math.pow(26, arr.length - j - 1)) + small);

                        //已经拿到匹配的值 中止循环
                        i = 91;
                    }
                }
            }

            //把每次循环的字符对应excel的值 进行累加记录（大小写都一起记录）
            sum = big + small + sum;

            //判断是否到最后一个字符
            if (j == arr.length - 1) {
                //输出记录的总和
                return sum + x;
            }
        }
        throw new RuntimeException("输入错误");
    }
}



