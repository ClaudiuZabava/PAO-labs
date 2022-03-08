package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ex1:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i <= n ; i += 2){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        /* 2.	Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.
         */
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("A=");
        int a = scanner1.nextInt();
        System.out.print("B=");
        int b = scanner1.nextInt();
        System.out.println();
        System.out.print(max(a,b));

        System.out.println();



       /* 3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
        */
        System.out.print("Nr de calculat factorial:");
        int nr = scanner.nextInt();
        int fact=1;
        for(int i=2;i<=nr;++i)
        {
            fact = fact*i;
        }

        System.out.print(fact);


        System.out.println();
        System.out.println("Ex5:");

        int m = scanner.nextInt();
        int[] v1 = new int[0];
        int[] v2 = new int[0];
        int k;
        for(int i=1;i<=m;i+=1)
        {
            k=scanner.nextInt();
            if(k%2==0)
            {
                v1 = Arrays.copyOf(v1,v1.length+1);
                v1[v1.length-1]=k;
            }
            else
            {
                v2 = Arrays.copyOf(v2,v2.length+1);
                v2[v2.length-1]=k;
            }
        }
        for(int i=1;i<=v1.length;i+=1)
        {
            System.out.print(v1[i-1]+" ");
        }
        System.out.println();
        for(int i=1;i<=v2.length;i+=1)
        {
            System.out.print(v2[i-1]+" ");
        }

        /*
        Ex6. Cititi n numere, pana cand apare valoarea -1. Calculati media celor n numere citite.
        */
        System.out.println();
        System.out.println("Ex6: introducti notele elevului urmat de -1");
        int[] v3 = new int[0];
        int sum=0;
        while(true)
        {
            k = scanner.nextInt();
            if(k==-1)
            {
                System.out.print((double)sum/v3.length);
                break;
            }
            sum+=k;
            v3 = Arrays.copyOf(v3,v3.length+1);
            v3[v3.length-1] = k;
        }

    }
}
