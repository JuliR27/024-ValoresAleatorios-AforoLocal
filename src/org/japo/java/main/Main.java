/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final int AFORO_MIN = 0;
        final int AFORO_MAX = 100;

        int aforo = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo actual del local...:%d%n", aforo);
    }

}
