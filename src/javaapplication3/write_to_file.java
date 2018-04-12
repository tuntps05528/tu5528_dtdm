/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class write_to_file {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int n;
        nhanvien nvs[];
        System.out.print("Nhap so nhan vien: ");
        n = in.nextInt();
        nvs = new nhanvien[n];
        for(int i = 0;i < n;i++){
            in.nextInt();
            nhanvien nv = new nhanvien();
            System.out.println("Nhap NV thu"+(i+1));
            System.out.println("Manv: ");
            nv.setManv(in.nextLine());
            System.out.println("Hoten: ");
            nv.setHoten(in.nextLine());
            System.out.println("Tuoi: ");
            nv.setTuoi(in.nextInt());
            System.out.println("Luong: ");
            nv.setLuong(in.nextFloat());
            nvs[i]=nv;      
        }
        try{
            FileWriter fr = new FileWriter("D:/nhanvien.txt");
            BufferedWriter bw = new BufferedWriter(fr);
            for(int i = 0;i < nvs.length;i++){
                String strnv = nvs[i].toString();
                bw.write(strnv);
            }
            bw.flush();
            bw.close();
        }catch(IOException e){
            System.out.println("Error: "+ e);
        } 
    }
}
