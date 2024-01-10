package FunctionalIntarface.Example;

import java.util.Arrays;
import java.util.List;
// import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    // //Primeiro Método
    // public static void main(String[] args) {
    //     //Criando lista de números inteiros
    //     List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);
        
    //     //Usando o BinaryOperator com expressão Lambda para somar dois números inteiros
    //     BinaryOperator <Integer> somar = (num1, num2) -> num1 + num2;
        
    //     //Usando o BinaryOperatos para somar todos os números no Stream
    //     int resultado = numeros.stream()
    //         .reduce(0, somar);
        
    //     //Imprimindo o resultado da soma
    //     System.out.println("A soma dos números é: " + resultado);
    // }
    
    //Segundo Método
    // public static void main(String[] args) {
    //     //Criando lista de números inteiros
    //     List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);
        
    //     //Usando o BinaryOperator com classe anônima para somar dois números inteiros
    //     BinaryOperator <Integer> somar = new BinaryOperator<Integer>() {

    //         //Método para somar dois números
    //         @Override
    //         public Integer apply(Integer num1, Integer num2) {
    //             return num1 + num2;
    //         }
    //     };

    //     //Usando o BinaryOperatos para somar todos os números no Stream
    //     int resultado = numeros.stream()
    //         .reduce(0, somar);

    //     //Imprimindo o resultado da soma
    //     System.out.println("A soma dos números é: " + resultado);
    // }

    // //Terceiro Método sem utilizar o BinaryOperator
    public static void main(String[] args) {
        //Criando lista de números inteiros
        List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);
        
        // //Usando o BinaryOperator com expressão Lambda para somar dois números inteiros
        // BinaryOperator <Integer> somar = (num1, num2) -> num1 + num2;
        
        //Usando o BinaryOperatos para somar todos os números no Stream
        int resultado = numeros.stream()
            .reduce(0, Integer :: sum);
        
        //Imprimindo o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
