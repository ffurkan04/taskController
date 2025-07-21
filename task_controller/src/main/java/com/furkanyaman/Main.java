package com.furkanyaman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> taskList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static boolean isWorking= true;
    static int number;
    public static void main(String[] args) {
        
        while(isWorking){
            System.out.print("Sisteme hoşgelsiniz \n 1.Görev Ekle \n 2.Görev Sil \n 3.Görevleri Görüntüle \n 4.Çıkış");
            number = input.nextInt();
            switch(number){
                case 1:
                addTask();
                
                case 2:
                removeTask();
                case 3:
                showTask();
                case 4:
                isWorking =false;
                break;
                default:
                System.out.println("Hatalı veri girildi");
            }
        }
    }
    public static void addTask(){
        
    }
    public static void removeTask(){

    }
    public static void showTask(){

    }
}