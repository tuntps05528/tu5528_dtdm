/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.io.Serializable;

/**
 *
 * @author PC01
 */
public class nhanvien implements Serializable{
    String manv;
    String hoten;
    int tuoi;
    float luong;
    public nhanvien(){
    }
    public nhanvien(String manv, String hoten, int tuoi, float luong){
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    @Override
    public String toString(){
        return manv+"\t"+hoten+"\t"+tuoi+"\t"+luong+"\n";
    }
}
