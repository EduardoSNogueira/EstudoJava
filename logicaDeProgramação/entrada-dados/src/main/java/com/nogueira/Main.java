package com.nogueira;

import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next("oi");
        //sc.next(); para String -- sc.nextInt(); var int  -- sc.nextDouble(); var double
         System.out.println("Você digitou: " + x);
        
        char  y;
        y = sc.next().charAt(0);
        //sc.next().charAt(0); var char
        System.out.println("Você digitou; " + y);
       



        sc.close();
    }
}