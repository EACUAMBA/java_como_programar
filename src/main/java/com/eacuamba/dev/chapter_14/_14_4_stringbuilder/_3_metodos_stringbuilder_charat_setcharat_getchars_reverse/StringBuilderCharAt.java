package com.eacuamba.dev.chapter_14._14_4_stringbuilder._3_metodos_stringbuilder_charat_setcharat_getchars_reverse;

public class StringBuilderCharAt {
    public static void main(String[] args) {
        StringBuilder stringBuilder =  new StringBuilder("Edilson Alexandre C.");

        System.out.printf("stringBuilder = %s%n", stringBuilder.toString());
        System.out.printf("Character as 0: %s%nCharacter at 4: %s%n", stringBuilder.charAt(0), stringBuilder.charAt(4));

        char[] charArray = new char[stringBuilder.length()];
        stringBuilder.getChars(0, stringBuilder.length(), charArray, 0);
        System.out.print("The characters are: ");

        for(char c: charArray)
            System.out.printf("%s", c);

        stringBuilder.setCharAt(19, 'u');
        stringBuilder.setLength(24);
        stringBuilder.setCharAt(20, 'a');
        stringBuilder.setCharAt(21, 'm');
        stringBuilder.setCharAt(22, 'b');
        stringBuilder.setCharAt(23, 'a');

        System.out.printf("%n%nstringBuilder = %s", stringBuilder.toString());

        stringBuilder.reverse();;
        System.out.printf("%n%nstringBuilder = %s%n", stringBuilder.toString());
    }
}
