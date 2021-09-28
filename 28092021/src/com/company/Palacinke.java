package com.company;

public class Palacinke {

    private int jaja;
    private int mlijeko;
    private int brasno;

    void unesiJaja(int jaja){
        this.jaja = jaja;
    }
    void unesiBrasno(int brasno){
        this.brasno = brasno;
    }
    void unesiMlijeko(int mlijeko){
        this.mlijeko = mlijeko;
    }

    int ispeciPalacinke() {
        int komJ = jaja/3;
        int komB = brasno/250;
        int komM = mlijeko/350;

        int najM;
        if(komJ<komB && komJ<komM)
            najM = komJ;
        else if(komB<komJ && komB<komM)
            najM=komB;
        else
            najM= komM;

        return 10*najM;
    }
}
