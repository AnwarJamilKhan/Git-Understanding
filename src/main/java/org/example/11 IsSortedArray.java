package org.example;

class IsSortedArray {

    public static void main(String[] args) {

        System.out.println("Welcome to Array Sorting Check Post\n");

        int [] arryNum = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(arryNum);
        boolean isDec = isDecreasing(arryNum);

        if(isInc || isDec)
        {
            System.out.println("The Array is sorted");
        }
        else
        {
            System.out.println("The Array is not sorted");
        }
    }

    public static boolean isIncreasing (int [] numArr)
    {
        int i =1;
        while(i < numArr.length) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }


    public static boolean isDecreasing (int [] numArr)
    {
        int i =1;
        while(i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
