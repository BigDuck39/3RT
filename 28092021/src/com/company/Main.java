package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Palacinke palacinke = new Palacinke();

        System.out.println("unesi kolicinu jaja u komadima: ");
        palacinke.unesiJaja(in.nextInt());

        System.out.println("unesi kolicinu mlijeka u mililitrima: ");
        palacinke.unesiMlijeko(in.nextInt());

        System.out.println("unesi kolicinu brasna u gramima: ");
        palacinke.unesiBrasno(in.nextInt());

        System.out.println("mozes ispeci " + palacinke.ispeciPalacinke() + " komada palacinki");
    }
}
