package Lesson86homework;

import java.util.Scanner;

public class AllTasks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) Cümlədə neçə simvol var
        System.out.println("Cumle daxil et:");
        String cumle = sc.nextLine();
        System.out.println("Simvol sayi: " + cumle.length());


        // 2) Ad ve soyadi birlesdir
        System.out.println("Ad daxil et:");
        String ad = sc.nextLine();

        System.out.println("Soyad daxil et:");
        String soyad = sc.nextLine();

        String tamAd = ad + " " + soyad;
        System.out.println("Tam ad: " + tamAd);


        // 3) 4-cu simvolu tap
        System.out.println("Metn daxil et:");
        String text = sc.nextLine();

        if(text.length() >= 4){
            System.out.println("4-cu simvol: " + text.charAt(3));
        }


        // 4) gmail ile bitir yoxla
        System.out.println("Email daxil et:");
        String email = sc.nextLine();

        if(email.endsWith("@gmail.com")){
            System.out.println("Gmail adresidir");
        }else{
            System.out.println("Gmail adresi deyil");
        }


        // 5) Parollar eynidir yoxla
        System.out.println("Parol 1:");
        String p1 = sc.nextLine();

        System.out.println("Parol 2:");
        String p2 = sc.nextLine();

        if(p1.equals(p2)){
            System.out.println("Parollar eynidir");
        }else{
            System.out.println("Parollar ferqlidir");
        }


        // 6) Ilk a herfinin indeksi
        System.out.println("Metn daxil et:");
        String aText = sc.nextLine();

        int index = aText.indexOf('a');
        System.out.println("Ilk a indeksi: " + index);


        // 7) Metn bosdur ya yox
        System.out.println("Metn daxil et:");
        String bos = sc.nextLine();

        if(bos.isEmpty()){
            System.out.println("Metn bosdur");
        }else{
            System.out.println("Metn bos deyil");
        }


        // 8) Bosluqlari - ile evez et
        System.out.println("Cumle daxil et:");
        String replaceText = sc.nextLine();

        String yeni = replaceText.replace(" ", "-");
        System.out.println(yeni);


        // 9) Ad soyadi ayir
        System.out.println("Tam ad daxil et:");
        String tam = sc.nextLine();

        String[] hisseler = tam.split(" ");
        for(String h : hisseler){
            System.out.println(h);
        }


        // 10) Telefon +994 ile baslayir
        System.out.println("Telefon daxil et:");
        String tel = sc.nextLine();

        if(tel.startsWith("+994")){
            System.out.println("Dogru format");
        }else{
            System.out.println("Yanlis format");
        }


        // 11) 5-ci indeksden sonrasini cixar
        System.out.println("Cumle daxil et:");
        String sub = sc.nextLine();

        if(sub.length() > 5){
            System.out.println(sub.substring(5));
        }


        // 12) Boyuk ve kicik herf
        System.out.println("Cumle daxil et:");
        String caseText = sc.nextLine();

        System.out.println("Boyuk: " + caseText.toUpperCase());
        System.out.println("Kicik: " + caseText.toLowerCase());


        // 13) Java sozu var ya yox
        System.out.println("Cumle daxil et:");
        String javaText = sc.nextLine();

        if(javaText.contains("Java")){
            System.out.println("Java sozu var");
        }else{
            System.out.println("Java sozu yoxdur");
        }


        // 14) Baslangic ve son bosluqlari sil
        System.out.println("Metn daxil et:");
        String trimText = sc.nextLine();

        System.out.println(trimText.trim());

    }
}