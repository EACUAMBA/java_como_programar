package com.eacuamba.dev.chapter_11._11_6_liberando_a_pilha_e_obtendo_informacoes_de_um_objecto_de_excecao;

public class UsingException {
    public static void main(String[] args) {
        System.out.println("Trying to catch the exceptions");
        try {
            method4();
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println(exception.getMessage());
            exception.printStackTrace();

            System.out.printf("%nStacktrace from getStackTrace:%n");

            System.out.println("Class\t\tFile\t\tLine\t\tMethod");

            StackTraceElement[] stackTraceElements = exception.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.printf("%s\t", stackTraceElement.getClassName());
                System.out.printf("%s\t", stackTraceElement.getFileName());
                System.out.printf("%s\t", stackTraceElement.getLineNumber());
                System.out.printf("%s\n", stackTraceElement.getMethodName());
            }

        }

    }

    public static void method4() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method1();
    }

    public static void method1() throws Exception {
        throw new Exception("Excecao do metodo 1");
    }

}
