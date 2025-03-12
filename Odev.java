/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class Odev {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //kullanıcıdan öğrenci sayisini alıyorum
        System.out.println("Ogrenci sayisini giriniz:");
        int n=input.nextInt(); //ogrenci sayisi=n
        //öğrenci bilgileri için dizi oluşturdum
        int[] ogrencino=new int[n];
        String[] ogrencisim=new String[n];
        int[] vizeler=new int[n];
        int[] finaller=new int[n];
        //öğrenci bilgilerini alma metodu
        ogrenciBilgiAlma(n,ogrencino,ogrencisim,vizeler,finaller);
        //öğrenci bilgilerini ekrana yazdıran metod
        ogrenciBilgi(ogrencino,ogrencisim, vizeler, finaller);
        double[] sinavOrtalama = null;
        altmisdanKucukNotAlanlar(ogrencino,ogrencisim,sinavOrtalama);
        double enYuksekNot=enYuksekSinavSonucu(n,vizeler,finaller);
        System.out.println("En yuksek sinav sonucu:"+enYuksekNot);
        double enDusukNot=enDusukSinavSonucu(n,vizeler,finaller);
        System.out.println("En dusuk sinav sonuc:"+enDusukNot);
        sinavSonucKucuktenBuyuge(n,ogrencino,ogrencisim,vizeler,finaller);
        
        
    }
    public static void ogrenciBilgiAlma(int n,int[] ogrencino,String[]ogrencisim,int[] vizeler,int[] finaller){
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=n;i++){
            System.out.print(i+". ogrencinin bilgilerini girin:");
            System.out.print("Ogrenci numarasi:");
            ogrencino[i]=input.nextInt();
            input.nextLine();
            System.out.print("Ogrenci adi:");
            ogrencisim[i]=input.nextLine();
            System.out.print("Ogrencinin nesneye yonelik programlama dersi vize notu:");
            vizeler[i]=input.nextInt();
            System.out.print("Ogrencinin nesneye yonelik programlama dersi final  notu:");
            finaller[i]=input.nextInt();
            
        }
        
        
    }
    public static void ogrenciBilgi( int[] ogrencino, String[] ogrencisim, int[] vizeler,int[] finaller){
        System.out.println("Numara----İsim----vize notu----Final notu");
        for(int i=0;i<ogrencino.length;i++){
           System.out.println(ogrencino[i]+" "+ogrencisim[i]+" "+vizeler[i]+" "+finaller[i]);      
        }
    }
    public static double[] sinavOrtalama(int[] vizeler,int[] finaller){
        int n=vizeler.length;
        double[] ortalama=new double[n];
         
        for(int i=0;i<n;i++){
           ortalama[i]=(vizeler[i]*0.4)+(finaller[i]*0.6);    
        }
        return ortalama;
    }
    public static void altmisdanKucukNotAlanlar(int[] ogrencino,String[] ogrencisim,double[] sinavOrtalama){
      for(int i=0;i<sinavOrtalama.length;i++){
        if(sinavOrtalama[i]<60){
            System.out.println("60'dan kucuk not alan ogrenci numarasi:"+ ogrencino[i]+"ismi"+ogrencisim[i]);
            }  
        }    
    }
    public static void ortalamaUstundekiler(int n,int[] ogrencino,double[] sinavOrtalama,int[] vizeler,int[] finaller){
        double toplam=0;
        for(int i=0;i<n;i++){
        double ortalama=(vizeler[i]*0.4)+(finaller[i]*0.6);
        toplam+=ortalama;
            
        }
        double genelOrtalama=toplam/n;    
        for(int i=0;i<n;i++){
        double ogrenciOrtalama=(vizeler[i]*0.4)+(finaller[i]*0.6);
        if(ogrenciOrtalama>genelOrtalama){
            System.out.println("Ortalamanin ustunde not alan ogrencilerin numarasi:" + ogrencino[i]+"Ogrencinin notu:"+ogrenciOrtalama);
             }
         }        
        }
    
        public static int altmisdanKucukNotAlanlarinSayisi(int n,int[] vizeler,int[] finaller){
            int sayac=0;
            for(int i=0;i<n;i++){
            double ortalama=(vizeler[i]*0.4)+finaller[i]*0.6;
              if(ortalama<60){
                 sayac++; //60dan küçük öğrenci sayisini arttır
                }
            }
            return sayac; //ogrenci sayisii döndürür  
        }
        public static double enYuksekSinavSonucu(int n,int[] vizeler,int[] finaller){
            double enYuksekSinavSonucu=0.0; //return için en yüksek sonucu tutan değişken değişken
            for(int i=0;i<n;i++){
            double ortalama=(vizeler[i]*0.4)+finaller[i]*0.6;
            if(ortalama>enYuksekSinavSonucu){
                enYuksekSinavSonucu=ortalama; //daha yüksek not bulursan güncelle
            }
                
            }
            return enYuksekSinavSonucu;
        }
       public static double enDusukSinavSonucu(int n,int[] vizeler,int[] finaller){
           double enDusukSinavSonucu=0.0;
           for(int i=0;i<n;i++){
           double ortalama=(vizeler[i]*0.4)+(finaller[i]*0.6);
             if(enDusukSinavSonucu>ortalama){
                 enDusukSinavSonucu=ortalama;   
               }
           }
           return enDusukSinavSonucu;
       }
       public static void sinavSonucKucuktenBuyuge(int n,int[] ogrencino,String[] ogrencisim, int[]vizeler,int[] finaller){
          double[] ortalama=new double[n];
          for(int i=0;i<n;i++){
              ortalama[i]=(vizeler[i]*0.4)+(finaller[i]*0.6);
              }
          //bubble sort ile küçükten büyüğe sıralama
          for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
               if(ortalama[j]>ortalama[j+1]){
                //ortalamaları yer değiştirdim
                double geciciort=ortalama[j];
                ortalama[j]=ortalama[j+1];
                ortalama[j+1]=geciciort;
                //Öğrenci numaralarını yer değiştir
                int gecicino=ogrencino[j];
                ogrencino[j]=ogrencino[j+1];
                ogrencino[j+1]=gecicino;
                //öğrenci isimlerini yer değiştir
                String gecicisim=ogrencisim[j];
                ogrencisim[j]=ogrencisim[j+1];
                ogrencisim[j+1]=gecicisim;   
                  }
                  
              }
          }
          //sonucu ekrana yazdırıyorum
          System.out.println("Kucukten buyuge sırali ogrenci listesi:");
         for(int i=0;i<n;i++){
          System.out.println("Ogrenci No:"+ogrencino[i]+"Ogrenci ismi:"+ogrencisim[i]+"sinav sonucu:"+ortalama[i]);
         }  
          }   
       }
        
        
    

