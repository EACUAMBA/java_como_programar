package com.eacuamba.dev.chapter_14._14_4_stringbuilder._2_metodos_stringbuilder_length_capacity_setlength_ensurecapacity;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("My name is Edilson Alexandre Cuamba");
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", builder.toString(), builder.length(), builder.capacity());

        builder.ensureCapacity(750);
        System.out.printf("New Capacity = %d%n%n", builder.capacity());

        builder.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", builder.length(), builder.toString());
    }
}
