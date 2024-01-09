package FunctionalIntarface.Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Criando lista de números inteiros
        List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);

        //Usando o Consumer com expressão Lambda para imprimir números pares
        Consumer <Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usando o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
