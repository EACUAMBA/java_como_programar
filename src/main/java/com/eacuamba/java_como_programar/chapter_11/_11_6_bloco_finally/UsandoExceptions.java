package com.eacuamba.java_como_programar.chapter_11._11_6_bloco_finally;

public class UsandoExceptions {
    public static void main(String[] args) {

        try{
            throwException();
        }catch (Exception exception){
            System.err.println("Estou imprimindo a mensagem de erro do catch do metodo main..metodo main() msg: " + exception.getMessage());
        }finally {
            System.out.println("Liberando recursos com o finally do metodo main()");
        }
        doesNotThrowEsception();
        System.out.println("Terminando o metodo main.");
    }

    public static void throwException() throws Exception{
        try{
            System.out.println("Eu lanço uma excecção.... metódo thowException()");
            throw new Exception("Fui lançada no metódo thowException().");

        }catch (Exception exception){
            System.err.println("Capiturei a excecção..metódo thowException() msg: " + exception.getMessage());
            System.err.flush();
            throw exception;

        }finally {
            System.out.println("O finally esta sendo executado agora... metódo thowException()");
        }
    }

    private static void doesNotThrowEsception(){
        try{
            System.out.println("Eu lanço uma excecção.... metódo doesNotThrowEsception()");

        }catch (Exception exception){
            System.err.println("Capiturei a excecção..metódo doesNotThrowEsception() msg: " + exception.getMessage());
            System.err.flush();
        }finally {
            System.out.println("O finally esta sendo executado agora...metódo doesNotThrowEsception()");
        }
    }
}
