package com.furkanyaman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> taskList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static boolean isWorking = true;

    public static void main(String[] args) {
        while (isWorking) {
            System.out.print("""
                Sisteme hoşgeldiniz 
                1. Görev Ekle 
                2. Görev Sil 
                3. Görevleri Görüntüle 
                4. Tüm Görevleri Sil 
                5. Çıkış
                Seçiminiz: """);

            int number;
            try {
                number = input.nextInt();
                input.nextLine(); //girdi temizleme
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir sayı girin.");
                input.nextLine(); // hatalı giriş temizleniyor
                continue;
            }

            switch (number) {
                case 1 -> addTask();
                case 2 -> removeTask();
                case 3 -> showTask();
                case 4 -> clearAllTask();
                case 5 -> isWorking = false;
                default -> System.out.println("Hatalı veri girildi");
            }
        }
    }

    public static void addTask() {
        System.out.println("Lütfen görev adı giriniz:");
        String taskName = input.nextLine();
        taskList.add(taskName);
    }

    public static void removeTask() {
        System.out.println("Lütfen silmek istediğiniz görevi yazınız:");
        String taskName = input.nextLine();
        if (taskList.remove(taskName)) {
            System.out.println("Görev silindi.");
        } else {
            System.out.println("Görev bulunamadı.");
        }
    }

    public static void showTask() {
        if (taskList.isEmpty()) {
            System.out.println("Hiç görev yok.");
        } else {
            System.out.println("Görevler:");
            for (String task : taskList) {
                System.out.println("- " + task);
            }
        }
    }

    public static void clearAllTask() {
        taskList.clear();
        System.out.println("Tüm görevler silindi.");
    }
}