package com.company;

public class E8_2 {
    public static void main(String[] args) {
        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};

        int length = a.length -1;

        String s = "";

        for (int i = 0; i <= length; i += 2){
            s = s + a[i];
        }

        System.out.println(s);

    }
}
