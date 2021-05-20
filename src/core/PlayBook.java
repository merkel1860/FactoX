package core;

import java.util.Scanner;

public class PlayBook {

    public static void main(String[] args) {
	// write your code here
        int value;
        int result;
        int size;

        value = readValue();
        result = factoX(value);
        display(value, result);

        size = readValue();
        int[] table = readArray(size);
        display(table,size);
    }

    private static void display(int[] table, int length) {
        for (int i =0; i< length; i++){
            System.out.println("Table ["+(i+1)+"] = "+table[i]);
        }
    }

    private static int[] readArray(int size) {
        int[] temp = new int[20];
        for (int i=0; i< size; i++){
            temp[i] = readValue();
        }
        return temp;
    }

    private static void display(int value, int result) {
        System.out.println("Le facto de "+value+" est :"+result);
    }

    private static int factoX(int value) {
        int temp = 1;
        if(value == 1){
            temp = 1;
        }else if(value > 1){
            temp = value * factoX(value-1);
        }

        return temp;
    }

    private static int readValue() {
        System.out.println("Enter numeric value :");
        Scanner scanner = new Scanner(System.in);
        int v = Integer.valueOf(scanner.nextLine());
        return v;
    }
}
