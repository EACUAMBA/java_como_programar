package com.eacuamba.dev.chapter_8._8_12_static_import;

import static java.lang.Math.*;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class StaticImportContext {
    public static void main(String[] args) {
        System.out.println("Valor de PI é " + PI);
        System.out.println("Valor de E é " + E);
        System.out.println("Qaudrado de 5 é " + pow(5, 2));
        System.out.println("Raiz de 25 é " + sqrt(25));
        System.out.println("A redondamento por defeito de 3,98 é " + floor(3.98));
        System.out.println("A redondamento por excesso de 3,98 é " + ceil(3.98));
    }
}
