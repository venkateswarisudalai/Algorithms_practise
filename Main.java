package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static int[] twosumBruteforce(int target, int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length; i++) {
            //2 7 11 15   9 --> 0 1
            //{2, 3, 7, 9, 11}; 20
            int complement = target - nums[i];
            //7
            if (map.containsKey(complement)) {
//                System.out.println(map.get(complement));
//                System.out.println(i);
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
                System.out.println(nums[i]);
                System.out.println(i);

            }
        }
        return new int[]{};

    }
        public static void main (String[]args){
            int[] nums= new int[]{2, 3, 7, 9, 11};
            int target = 20;
            twosumBruteforce(target, nums);

        }

}