/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dita.program;

import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
/**
 *
 * @author Dita Indriawati
 */
public class SelectionSort {

    private static long startTime;

    public static void main(String[] args) {
    
        int data[] = {12, 5, 19, 26, 35, 39, 25};
        int min = data[0];
        int index = 0;
        int swappingProcess = 0;
        
        for(int i = 0; i < data.length - 1; i++){
            for(int j = i; j < data.length; j++){
                if(data[j] < min){
                    min = data[j];
                    swappingProcess++;
                }
                System.out.println(Arrays.toString(data));
            }
            if(min<data[i]){
                data[index] = data[i];
                data[i] = min;
            }
            min = data[i + 1];
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("total waktu yang diperlukan : ");
    }
    
}