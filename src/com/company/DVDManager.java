package com.company;

public class DVDManager {
    DVD[] dvd = new DVD[500];

    public boolean addDVD(DVD  d){      //新增DVD
        for (int i=0;i<dvd.length;i++){
            if (dvd[i] == null){
                dvd[i] = d;
                return true;
            }
        }
        return false;
    }

    public void showInfo(){             //查看DVD
        System.out.println("序号\t状态\t名称\t\t借出日期");
        int serial = 1;
        for (int i=0;i<dvd.length;i++){
            if (dvd[i] != null) {
                System.out.println(serial+"\t\t"+dvd[i].toString());
                serial ++;
            }
        }
    }

    public void deleteDVD (String  name){
        for (int i=0;i<dvd.length;i++){
            if (dvd[i] != null){
                if (name.equals(dvd[i].getName())){
                    if (dvd[i].getState().equals("借出")) {
                        dvd[i] = null;
                        System.out.println("删除成功!");
                        break;
                    }else {
                        System.out.println("该书籍已借出,不能删除!");
                    }
                }else {
                    System.out.println("该书籍没有!");
                }
            }
        }
    }

    public boolean lendDVD(String name,String price){
        for (int i=0;i<dvd.length;i++){
            if (dvd[i] != null){
                if (name.equals(dvd[i].getName())){
                    if (dvd[i].getState().equals("可借")){
                        dvd[i].setPrice(price);
                        dvd[i].setState("已借出");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void returnDVD(String name,String price){
        for (int i=0;i<dvd.length;i++){
            if (dvd[i] !=null){
                if (name.equals(dvd[i].getName())){
                    if (dvd[i].getState().equals("已借出")){
                        System.out.println("借出日期为:"+dvd[i].getPrice());
                        dvd[i].setPrice(price);
                        System.out.println("归还日期为:"+dvd[i].getPrice());
                        dvd[i].setState("可借");
                    }
                }
            }
        }
    }
}
