/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class NotHesaplama {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("matematik dersi notunuzu giriniz:");
        double ortalama=0;
        int matnot=scn.nextInt();
        if(0<matnot &&matnot<100){
            
        }else{
            System.out.println("1 ile 100 arasında  not giriniz:");
            matnot=scn.nextInt();
        }
        System.out.println("turkce dersi notunuzu giriniz:");
        int turnot=scn.nextInt();
        if(0<=turnot &&turnot<=100){
            
        }else{
            System.out.println("1 ile 100 arasında not giriniz:");
            turnot=scn.nextInt();
            
        }
        System.out.println("beden dersi notunuzu giriniz:");
        int bedenot=scn.nextInt();
         if(0<=bedenot &&bedenot<=100){
             
         }else{
             System.out.println("1 ile 100 arasında  not giriniz:");
             bedenot=scn.nextInt();
         }
         ortalama=(matnot+turnot+bedenot)/3;
         if(ortalama>=50){
             System.out.println("sinifi"+" "+ortalama+" "+"ile gectiniz");
         }else{
             System.out.println("siniftan"+" "+ortalama+" "+"ile kaldiniz");
         }
         
     }
        
    }

