package Arrays;

import java.util.Scanner;

public class SortedArray {
   private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

int[] myIntegers = getIntegers(5);
int[] sorted = sortIntegers(myIntegers);
printArray(sorted);
    }


        public static int[] getIntegers(int ArraySize) {

            int[] Array = new int[ArraySize];
            System.out.println("Enter " + ArraySize + " digits.\r");
            for(int i = 0; i <Array.length; i++) {
                Array[i] = sc.nextInt();
            }
            return Array;
        }

        public static void printArray(int[] array) {
            for(int i = 0; i <array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }

        public static int[] sortIntegers(int[] array) {
            int[] SortedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                SortedArray[i] = array[i];
            }


            int Temp;
            boolean blue = true;
            while(blue) {
                blue = false;
                for (int i = 0; i < SortedArray.length - 1; i++) {
                    if (SortedArray[i] < SortedArray[i + 1]) {
                        Temp = SortedArray[i];
                        SortedArray[i] = SortedArray[i + 1];
                        SortedArray[i + 1] = Temp;
                        blue = true;
                    }
                }
            }
            return SortedArray;
        }
    }