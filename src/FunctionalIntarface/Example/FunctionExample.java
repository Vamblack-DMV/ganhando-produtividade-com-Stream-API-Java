package FunctionalIntarface.Example;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.stream.Collectors;


public class FunctionExample {
    // //Primeiro método
    // public static void main(String[] args) {
    //     //Criando uma lista de números inteiros
    //     List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);
        
    //     //Usando a Function com expressão Lambda para dobrar todos os números
    //     Function <Integer, Integer> dobrar = numero -> numero * 2;
        
    //     //Usando função para dobrar todos os números no Stream e armazená-los em outra lista
    //     List <Integer> numerosDobrados = numeros.stream()
    //     .map(dobrar)
    //     .collect(Collectors.toList());
        
    //     //Imprimindo a lista de números dobrados
    //     numerosDobrados.forEach(System.out :: println);
    // }

    //Segundo Método
    // public static void main(String[] args) {
    //     //Criando uma lista de números inteiros
    //     List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    //     //Usando a Function com uma classe anônima para dobrar todos os números
    //     Function <Integer, Integer> dobrar = new Function <Integer, Integer> () {

    //         //Método para dobrar os números gerado automaticamente
    //         @Override
    //         public Integer apply(Integer numero) {
    //             return numero * 2;
    //         }
    //     };

    //     //Usando a função para dobrar todos os números e armazená-los em outra lista
    //     List <Integer> numerosDobrados = new ArrayList<>();
    //     for (Integer numero : numeros) {
    //         numerosDobrados.add(dobrar.apply(numero));
    //     }

    //     //Imprimindo a lista de números dobrados
    //     for (Integer numeroDobrado : numerosDobrados) {
    //         System.out.println(numeroDobrado);
    //     }
    //  }

    // //Primeiro método sem utilizar o Function
    public static void main(String[] args) {
        //Criando uma lista de números inteiros
        List <Integer> numeros = Arrays.asList (1, 2, 3, 4, 5);
        
        // //Usando a Function com expressão Lambda para dobrar todos os números
        // Function <Integer, Integer> dobrar = numero -> numero * 2;
        
        //Usando função para dobrar todos os números no Stream e armazená-los em outra lista
        List <Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList();
        
        //Imprimindo a lista de números dobrados
        numerosDobrados.forEach(System.out :: println);
    }
}
