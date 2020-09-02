package Semyon_Belyaev_homework2;


public class Semyon_Belyaev_homework2 {
    public static void main(String[] args) {
        calculateArray();//задание 2
        calculateNumbersInArray();//задание 3
        fillArrayDiagonal();//задание 4
        findMinAndMaxValue();//задание 5
        System.out.println(checkBalance(new int[]{2, 3, 6, 7, 9, 5, 4}));//задание 6
        System.out.println(checkBalance(new int[]{7, 7, 6, 5, 4}));//задание 6
        changeNumbersPosition();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};//задание 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.println(arr[i]);
        }
    }

    static void calculateArray()//задание 2
    {
        int[] arr = new int[8];
        int o = 0;
        for (int a = 0; a < arr.length; a++, o = o + 3) {
            arr[a] = o;
            System.out.println(arr[a]);
        }
    }

    static void calculateNumbersInArray()//задание 3
    {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int t = 0; t < arr.length; t++) {
            if (arr[t] < 6) arr[t] = arr[t] * 2;
            System.out.println(arr[t]);
        }

    }

    static void fillArrayDiagonal() //задание 4
    {
        int[][] arr = new int[4][4];
        for (int b = 0; b < 4; b++) {
            for (int c = 0; c < 4; c++) {
                if ((b == c) || (b == arr.length - 1 - c)) {
                    arr[b][c] = 1;
                } else {
                    arr[b][c] = arr.length;
                }
                System.out.println(arr[b][c]);
            }
        }
    }

    static void findMinAndMaxValue()//задание 5
    {
        int[] arr = {6, 9, 45, 89, -87, -56, 0, 1};
        int min = arr[0];
        int max = arr[0];
        for (int y : arr) {
            System.out.println(y + " ");
        }
        for (int y = 0; y < arr.length; y++) {
            min = Math.min(min, arr[y]);
            max = Math.max(max, arr[y]);
        }
        System.out.println("min Value is " + min + " max Value is " + max);
    }

    static boolean checkBalance(int[] arr2) {
        int leftSum = 0, rightSum = 0;

        for (int k = 0; k < arr2.length + 1; k++) {
            leftSum = 0;
            rightSum = 0;

            for (int p = 0; p < k; p++) {
                leftSum += arr2[p];
            }

            for (int j = k; j < arr2.length; j++) {
                rightSum += arr2[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

    static void changeNumbersPosition() {
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int n = 2;
        for (int l = 0; l < arr3.length; l++) {

        }
    }
}