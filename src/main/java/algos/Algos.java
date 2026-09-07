package algos;

import org.springframework.stereotype.Component;

@Component
public class Algos {
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public int search(int[] arr, int data) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == data) return i;
        }
        return -1;
    }
}
