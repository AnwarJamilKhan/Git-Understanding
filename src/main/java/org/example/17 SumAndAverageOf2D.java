package org.example;

class SumAndAverageOf2D {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Sum and Average of 2 D");

        System.out.println("Please Enter the number of Array\n");

        int [][] sumAndAverage = ArrayUtility.input2DArray();

        long sum = sum(sumAndAverage);
        double avg = average(sumAndAverage);
        System.out.println("Your sum of Array is : " + sum);
        System.out.println("Your Average of the Array is : " + avg);
    }

    public  static long sum(int[][] sumArr){

        long sum = 0;
        int i = 0;
        while (i < sumArr.length){
            int j = 0;
            while (j < sumArr[i].length)
            {
                sum += sumArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] averageArr){

        if(averageArr.length == 0){
            return 0;
        }
        int rows = averageArr.length;
        int cols = averageArr[0].length;
        double size = rows * cols;

        return sum(averageArr)/(size);
    }

}
