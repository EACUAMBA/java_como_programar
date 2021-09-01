package chapter_11._11_11_assertivas;


import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma valor entre [10 e 0]: ");
        int valor = scanner.nextInt();

        assert (valor >= 0  && valor <= 10) : "Valor deve ser maior que 0 e menor que 10, incluso e não " + valor;

        System.out.println("Você digitou o valor " + valor);
    }
}
