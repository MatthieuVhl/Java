package org.example.exo;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercice2 {

//        public static int Factoriser(int a) {
//            int b = a;
//            if (b == 0) {
//                return 0;
//            } else {
//                return a * Factoriser(a  -1);
//            }
//        }
   public  enum Message{

       A("HIGHT"),
       B("MEDIUM"),
       C("LOW"),
       D("LOW");
       private String CaractereMessage;
       private Message(String caractere){
           this.CaractereMessage = caractere;
       }
       public String getCaractereMessage(){
           return this.CaractereMessage;
       }
}
}
