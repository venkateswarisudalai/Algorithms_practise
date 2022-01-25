package com.company;

import java.util.Scanner;

public class Main {

    private static int[] twosumBruteforce(int target, int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; i++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }

    return new int[]{};

}
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] nums = new int[n];
    for(int i = 0;i<n;i++)
    {
        nums[i] = input.nextInt();
    }
int target = input.nextInt();
    input.close();
    int[] indices = twosumBruteforce(target,nums);


    if (indices.length == 2)
    {
        System.out.println(indices[0] + "" + indices[1]);
    }
    else
    {
        System.out.println("No solution found");
    }
    }
}
