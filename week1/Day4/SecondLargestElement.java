package Day4;

import java.util.Scanner;

public class SecondLargestElement {

    public static void secondLargest(int[] arr){

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1;i< arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        if(largest == secondLargest){
            System.out.println("Not Available");
        }else{
            System.out.println("Second Largest element : "+secondLargest);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        secondLargest(arr);
    }
}
