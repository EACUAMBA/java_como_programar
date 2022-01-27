package com.eacuamba.dev.chapter_14._14_classe_string._6_concatenando_strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String pnome = "Edilson", nomem = "Alexandre", anome = "Cuamba";

        String  nome = pnome.concat(" ").concat(nomem).concat(" ").concat(anome);
        System.out.println(nome);
    }
}
