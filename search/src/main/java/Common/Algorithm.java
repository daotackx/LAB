/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

/**
 *
 * @author THAO LINH
 */
public class Algorithm {

    public void linearSearch(int arr[], int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println("Found " + value + " at index: " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
    }
    
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }                
            }
        }
    }

    public void binarySearch(int arr[], int value) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                System.out.println("Found " + value + " at index: " + mid);
                count++;
                return;
            }else if (value < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
    }
}
