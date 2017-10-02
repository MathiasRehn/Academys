package com.company;

public class Main {

    public static void main(String[] args) {
        int sum =  2 + 5;

        for (int i = 0; i<5; i++){
            sum = sum + i;

                if(sum >= 11){
                    break;
                }
            }

        System.out.println(sum);
    }
}
