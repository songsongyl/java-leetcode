package com.example01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next().toString();
        String[] arr  = str.split(",");
        int[] nums = new int[arr.length];
        for(int j = 0; j<nums.length;j++) {
            nums[j] = Integer.parseInt(arr[j]);
            System.out.println(nums[j]+" ");
        }
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("输入数组长度为：" + n);
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++){
//            nums[i]=scanner.nextInt();
//        }
        int a = sc.nextInt();
        System.out.println("输入目标为：" + a);
        sc.close();
        int[] b = new int[100];
      b =  twoSum(nums,a);
      for (int i=0 ;i<b.length;i++)
        System.out.println(b[i] + " ");
    }
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    result[1] = i;
                    result[0] = map.get(complement);
                    return result;
                }
                map.put(nums[i], i);
            }
            return result;
        }
    }

