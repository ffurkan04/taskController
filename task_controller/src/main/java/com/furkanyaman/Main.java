package com.furkanyaman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<String> taskList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean isWorking= true;
        int number;
        while(isWorking){
            System.out.print("Sisteme hoşgelsiniz \n 1.Görev Ekle \n 2.Görev Sil \n 3.Görevleri Görüntüle \n 4.Çıkış");
            number = input.nextInt();
            switch(number){
                case 1:
                //görev ekle
                case 2:
                //görev sil
                case 3:
                //görevleri görüntüle
                case 4:
                //çıkış
                default:
                //hatalı veri
            }
        }
    }
}