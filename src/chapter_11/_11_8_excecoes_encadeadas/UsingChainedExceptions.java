package chapter_11._11_8_excecoes_encadeadas;

public class UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method3();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void method3() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception in method 3.", exception);
        }
    }

    public static void method2() throws Exception {
        try {
            method1();
        } catch (Exception exception) {
            throw new Exception("Exception in method 2.", exception);
        }
    }

    public static void method1() throws Exception {
        try {
            method();
        } catch (Exception exception) {
            throw new Exception("Exception in method 1.", exception);
        }
    }

    public static void method() throws Exception {
        throw new Exception("Exception on method");
    }
}
