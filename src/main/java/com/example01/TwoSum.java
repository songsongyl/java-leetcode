package com.example01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Map<Integer,Integer> record = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("输入数组长度为：" + n);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i]=scanner.nextInt();
        }

        int a = sc.nextInt();
        System.out.println("输入目标为：" + a);
        sc.close();
        for (int i = 0 ; i < nums.length ;i ++){
            int num = a - nums[i];
            if(record.containsValue(num)){
                System.out.println(record.get(num) + i);
            }
            record.put(nums[i],i);
        }
    }


}
