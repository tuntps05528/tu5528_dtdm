/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.util.Scanner;
import ps04555_nguyenquochuy_lab3.nhanvien;

/**
 *
 * @author PC01
 */
public class MainNhanvien {
    public static void main(String[] args){
        nhanvien nv = new nhanvien();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap MaNV: ");
        nv.setManv(in.nextLine());
        System.out.println("Nhap Ho Ten nv: ");
        nv.setHoten(in.nextLine());
        System.out.println("Nhap luong nv: ");
        nv.setLuong(in.nextFloat());
        System.out.println("Nhap luong nv: ");
        nv.setTuoi(in.nextInt());
        System.out.println("Nhap Tuoi nv: ");
        System.out.println("Thong tin nv vua nhap: ");
        System.out.println("_ MaNV: "+nv.getManv());
        System.out.println("_ Hoten: "+nv.getHoten());
        System.out.println("_ Luong: "+nv.getLuong());
        System.out.println("_ Tuoi: "+nv.getTuoi());
    }
}
