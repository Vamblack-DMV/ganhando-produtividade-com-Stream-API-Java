package FunctionalIntarface.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
// import java.util.stream.Collectors;

public class PredicateExample {
    //Primeiro Método
    // public static void main(String[] args) {
    //     //Criando uma lista de números inteiros
    //     List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //     //Usando o Predicate com expressão Lambda para filtrar números pares
    //     Predicate <Integer> isPar = numero -> numero % 2 == 0;

    //     //Usando o Predicate para filtrar números pares no Stream e armazená-los em outra lista
    //     List <Integer> numerosPares = numeros.stream()
    //         .filter(isPar)
    //         .collect(Collectors.toList());

    //     //Imprimindo a lista de números pares
    //     numerosPares.forEach(System.out :: println);
    // }

    //Segundo método
    public static void main(String[] args) {
        //Criando lista de números inteiros
        List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usando o Predicate com uma classe anônima para filtrar números pares
        Predicate <Integer> isPar = new Predicate<Integer>() {
            
            //Método para filtar os números
            @Override
            public boolean test(Integer numero) {
                return numero % 2 == 0;
            }
        };

        //Usando o Predicate para filtrar números pares e armazená-los em outra lista
        List <Integer> numerosPares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (isPar.test(numero)) {
                numerosPares.add (numero);
            }
        }

        //Imprimindo a lista de números pares
        for (Integer numeroPar : numerosPares){
            System.out.println(numeroPar);
        }
    }
}
