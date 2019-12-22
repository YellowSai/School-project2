package com.company;

import java.util.Scanner;

public class DVDTest {
    public static void main(String[] args) {
        DVDManager dvdManager = new DVDManager();
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎使用迷你DVD管理器");
            System.out.println("---------------------------");
            DVDChoice.choice();
            System.out.println("---------------------------");
            System.out.print("请选择:");
            int choice = sca.nextInt();
            DVD dvd = new DVD();
            switch (choice) {
                case 1:
                    System.out.println("--->新增DVD\n");
                    System.out.print("请输入DVD名称:");
                    String name = sca.next();
                    dvd.setName(name);
                    if (dvdManager.addDVD(dvd)) {
                        System.out.println("新增《" + name + "》成功!");
                    } else {
                        System.out.println("新增失败!");
                    }
                    break;
                case 2:
                    System.out.println("--->查看DVD\n");
                    dvdManager.showInfo();
                    break;
                case 3:
                    System.out.println("--->删除DVD\n");
                    System.out.print("请输入DVD名称:");
                    String names = sca.next();
                    dvdManager.deleteDVD(names);
                    dvdManager.showInfo();
                    break;
                case 4:
                    System.out.println("--->借出DVD\n");
                    System.out.print("请输入DVD名称:");
                    String namess = sca.next();
                    System.out.print("请输入借出日期(年_月_日):");
                    String price = sca.next();
                    if (dvdManager.lendDVD(namess,price)){
                        System.out.println("借出"+namess+"成功!");
                    }else {
                        System.out.println("该书籍已借出!");
                    }
                    dvdManager.showInfo();
                    break;
                case 5:
                    System.out.println("--->归还DVD\n");
                    System.out.print("请输入DVD名称:");
                    String namesss = sca.next();
                    System.out.print("请输入归还日期:");
                    String prices = sca.next();
                    dvdManager.returnDVD(namesss,prices);
                    dvdManager.showInfo();
                    break;
                case 6:
                    return;
            }
            System.out.println("****************************");
            System.out.print("输入0退出:");
            int signout = sca.nextInt();
            if (signout == 0) {
                continue;
            }
        }
    }
}
