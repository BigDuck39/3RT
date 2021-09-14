    package com.company;

    import java.io.DataInput;
    import java.util.Random;
    class Trokut{
        int a;
        int b;
        public static double pitagora(int a,int b){
            return Math.sqrt(a*a+b*b);
        }
        double c =  pitagora(a,b);
        double povrsina = a*b/2;
    }

    public class Main {

        public static void main(String[] args) {
            DataInput in;
            Random ran = new Random();
            Trokut tocke = new Trokut();
           /* tocke.a = ran.nextInt(50);
            tocke.b = ran.nextInt(50);
            //int sl1 = ran.nextInt(10);
            //int sl2 = ran.nextInt(10);

            //System.out.println("sl1 = "+ sl1);
            //System.out.println("sl1 = "+ sl2);
            //System.out.println("sl1 + sl2 = "+(sl1+sl2));
            //System.out.println(sl1+" + "+sl2 +" = "+(sl1+sl2));
            System.out.println("a = " + tocke.a);
            System.out.println("b = " + tocke.a);
            System.out.println("c = " + tocke.c);
            System.out.println("P = " + tocke.povrsina);
            */

            //zad 3.14
            /*
            int a =ran.nextInt(10)-5;
            int b =ran.nextInt(10)-5;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            if(a<0 && b<0){
                System.out.println("Oba su negativna");
            }
            else if(a<0 || b<0){
                System.out.println("Jedan je negativan");
            }
            else if(a>=0 && b>=0){
                System.out.println("Oba su pozitivna");
            }
            */

        }
    }
