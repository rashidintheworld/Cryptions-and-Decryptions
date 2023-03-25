package az.orient.tasks;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*Number to String*");
        String[] arrBirlik = {" ", "bir", "iki", "uc", "dord", "bes", "alti", "yeddi", "sekkiz", "doqquz"};
        String[] arrOnluq = {" ", "on", "iyirmi", "otuz", "qirx", "elli", "altmis", "yetmis", "seksen", "doqsan"};
        while (true) {
            System.out.print("Ededi daxil edin -> ");
            String st = " ";
            int eded = sc.nextInt();
            if(eded==0){
                System.out.println("sifir");
            } else if (eded < 100) { //65
                st += arrOnluq[eded / 10] + " " + arrBirlik[eded % 10];
            } else if (eded < 1000) {
                st += arrBirlik[eded / 100] + " yuz " + arrOnluq[((eded - (eded % 10)) / 10) % 10] + " " + arrBirlik[eded % 10];
            }
            System.out.println("Ededin yazilisi -> " + st);
        }
    }
}
