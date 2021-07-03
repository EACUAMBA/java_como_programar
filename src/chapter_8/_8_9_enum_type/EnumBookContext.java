package chapter_8._8_9_enum_type;

import java.util.EnumSet;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class EnumBookContext {
    public static void main(String[] args) {
        System.out.printf("******* %s ********%n", "Imprimindo de forma cru!");
        for(Book book: Book.values())
            System.out.printf("The entire book:%n%s.%nOnly the title:%s, then the year of release:%s%n", book, book.getTitulo(), book.getAnoDeLancamento());

        System.out.printf("****** %s *****%n", "Printing an interval of values between CPCSHARP and CUH");
        for(Book book: EnumSet.range(Book.CPCSHARP,Book.CUH))
            System.out.printf("The entire book:%n%s.%nOnly the title:%s, then the year of release:%s", book, book.getTitulo(), book.getAnoDeLancamento());


    }
}
