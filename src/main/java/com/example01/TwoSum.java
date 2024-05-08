package com.example01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Map<Integer,Integer> record = new HashMap<>();
        Scanner sc = new Scanner(System.in);
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("输入数组长度为：" + n);
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++){
//            nums[i]=scanner.nextInt();
//        }
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next().toString();
        String[] arr  = str.split(",");
        int[] nums = new int[arr.length];
        for(int j = 0; j<nums.length;j++) {
            nums[j] = Integer.parseInt(arr[j]);
            System.out.println(nums[j]+" ");
        }

        int a = sc.nextInt();
        System.out.println("输入目标为：" + a);
        sc.close();
        record.put(nums[0],0);
        for (int i = 1 ; i < nums.length ;i ++){
            int num = a - nums[i];
            if(record.containsValue(num)){
                //return new int[]{i,record.get(num)};
                System.out.println(record.get(num) + " " + i);
            }
            record.put(nums[i],i);
        }
    }


}
