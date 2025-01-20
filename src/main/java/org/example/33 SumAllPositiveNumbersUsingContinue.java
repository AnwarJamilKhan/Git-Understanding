package org.example;

 class SumAllPositiveNumbersUsingContinue {
  public static void main(String[] args) {

   System.out.println("Welcome to adding positive numbers");
   int[] numArr = ArrayUtility.inputArray();

   int sum =0;
   for(int num : numArr)
   {
    if(num < 0)
    {
     continue;
    }
    sum += num;
   }
   System.out.println("The Sum of the positive number is : " + sum);
  }
}
