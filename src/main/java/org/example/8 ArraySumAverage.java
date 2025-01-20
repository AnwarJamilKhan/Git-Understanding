package org.example;

class ArraySumAverage {

    public static void main(String[] args) {

        System.out.println("Welcome to Array and Average");

        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("sum of the number is " + sum);
        System.out.println("Average of he numbers is : " + avg);

//        while (i < size)
//        {
//            System.out.println("The entered number are: "+ nums[i]);
//            i--;
//        }
    }

    public static long sum(int[] numArray)
    {
       long sum = 0;
       int i = 0;
       while (i < numArray.length)
       {
         //  sum += numArray[i];
           sum =sum + numArray[i];
           i++;
       }

        return sum;

    }

    public static int average(int[] numArray)
    {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
