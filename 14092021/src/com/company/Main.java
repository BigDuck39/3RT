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

            //zad4.16
            /*
            int parnih = 0;
            int neparnih = 0;
            int poz = 0;
            int neg = 0;
            int nula = 0;

            for (int i = 0; i < 5; i++) {
                int sluc = ran.nextInt(20) - 10;
                System.out.println(sluc);
                if(sluc %2 ==0){
                    parnih++;
                }
                else{
                    neparnih++;
                }
                if(sluc>0){
                    poz++;
                }
                else if (sluc == 0){
                    nula++;
                }
                else{
                    neg++;
                }

            }
            System.out.println("parnih = "+parnih);
            System.out.println("neparnih = "+neparnih);
            System.out.println("poz = "+poz);
            System.out.println("neg = "+neg);
            System.out.println("nula = "+nula);
             */
            //zad 4.17
            //a
            /*
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            //b
            for(int i = 0;i<7;i++){
                for(int j = 0;j<i;j++){
                        System.out.print("*");
                }

                System.out.println();
            }
            //c
            for(int i = 0;i<7;i++){
                for(int j = 0;j<7;j++){
                    if(j==0 || i==0 || i==6 || j==6)
                    System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            //d
            for(int i = 0;i<7;i++){
                for(int j = 0;j<7;j++){
                    if(j==3 || i==3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

             */
        }
    }
