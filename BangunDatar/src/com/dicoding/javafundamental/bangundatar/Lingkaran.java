/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.bangundatar;

import bangundatar.BangunDatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar  {
 private double pi = 3.1415;
    Lingkaran() {
    }
    public double luas(int s1, int s2) {
        return 0;
    }
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas(int r) { //metode overload
        return (pi * r * r);
    }
    public double keliling(int r) { //methode overload
        return (2 * pi * r);
    }    
}
