package CollectionFramework.ArraysClass;

import java.util.Arrays;

//ArraysClass provide us so many useful built in methods including search & sorting algorithms

public class ArraysClass {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};

        int index=Arrays.binarySearch(numbers,4);

        System.out.println(index);

        Integer[] num={33,1,22,12,3,44,43,35};

        Arrays.sort(num);

        for (int i: num){
            System.out.print(i+" ");
        }

        Arrays.fill(num,10);
        System.out.println();

        for (int i: num){
            System.out.print(i+" ");
        }
    }
}
