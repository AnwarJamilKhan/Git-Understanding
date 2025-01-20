package org.example;

class MergeTwoSortedArray {
    public static void main(String[] args) {

        System.out.println("Welcome to the World of Merge Two Sorted Array");

        int [] arrNum1 = ArrayUtility.inputArray();
        int [] arrNum2 = ArrayUtility.inputArray();
        int [] mergedArr = merger(arrNum1, arrNum2);
        System.out.println("Your merged Array is :");
        ArrayUtility.displayArray(mergedArr);
    }

    public static int [] merger(int[] arrNum1, int[] arrNum2){

        int arraySize = arrNum1.length + arrNum2.length;
        int [] newArray = new int[arraySize];
        int i =0, j =0, k =0;
        while(i<arrNum1.length || j < arrNum2.length){
            if(j == arrNum2.length || (i < arrNum1.length && arrNum1[i] < arrNum2[j]))
            {
                newArray[k] = arrNum1[i];
                i++;
                k++;
            } else{
                newArray[k] = arrNum2[j];
                k++;
                j++;

            }
        }
        return newArray;

    }
}
