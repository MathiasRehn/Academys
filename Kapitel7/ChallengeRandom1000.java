package com.company.Kapitel7;

import java.util.Random;

public class ChallengeRandom1000 {
    public static void main(String[] args) {
                Random random = new Random();
                int[] lista = new int[10];
                int a = 0;

                for (int i = 0; i<1000; i++){
                    System.out.println(a = random.nextInt(10)+1);
                    lista[a-1] = lista[a-1] + 1;
                }

                for (int i = 0; i<10; i++){
                    System.out.println("Antal " + (i+1) + ":or " + lista[i]);
                }
            }
        }
