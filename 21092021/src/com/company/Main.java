package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       /* Pravokutnik prav = new Pravokutnik();

        prav.a = 3;
        prav.b = 2;

        System.out.println("a = " + prav.a);
        System.out.println("b = " + prav.b);
        System.out.println("Površina = " + prav.povrsina());

        prav.b = 4;

        System.out.println("Površina2 = " +prav.povrsina());
        int povrsina = prav.a * prav.b;


        System.out.println("povrsina = " +povrsina);
        */

        //zad 9.2

        Krug kr1 = new Krug();
        Random ran = new Random();
        Krug kr2 = new Krug();
        kr1.r = 3;

        System.out.println("kr1: r=" + kr1.r + " pov=" +kr1.povrsina()+ " ops=" + kr1.opseg());

        kr2.r = ran.nextInt(10)+10.f;

        System.out.println("kr2: r=" + kr2.r + " pov=" +kr2.povrsina()+ " ops=" + kr2.opseg());

        System.out.println("Zbroj polumjera: " + (kr1.r + kr2.r));

    }
}
