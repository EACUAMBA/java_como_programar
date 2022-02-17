package com.eacuamba.dev.chapter_14._14_4_stringbuilder._1_construtores_stringbuilder;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(10);
        StringBuilder builder3 = new StringBuilder("Edilson");

        System.out.printf("Builder (buffer1) = \"%s\"%n", builder1);
        System.out.printf("Builder (buffer2) = \"%s\"%n", builder2);
        System.out.printf("Builder (buffer3) = \"%s\"%n", builder3);
    }
}
