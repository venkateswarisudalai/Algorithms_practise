package com.company;

public class Main {
    public static boolean ismonotonic(int[] array)
    {

        boolean nonincreasing = true;
        boolean nondecreasing = true;

       for(int i = 1;i<array.length;i++)
       {

              if(array[i] < array[i-1]){
                  nonincreasing = false;
              }

                  else if(array[i] > array[i-1]){
                       nondecreasing = false;
                   }

               }


       
        return nondecreasing || nonincreasing;
    }


    public static void main(String[] args) {
	int[] array = new int[]{-1,-5,-10,-1100,-1100,-1101,-1102,-9001};

    ismonotonic(array);

    }
}
