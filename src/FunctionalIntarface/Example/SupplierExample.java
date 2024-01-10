package FunctionalIntarface.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class SupplierExample {
    //Primeiro Método
    // public static void main(String[] args) {
    //     //Usando o Supplier com expressão Lambda para fornecer uma saudação personalizada
    //     Supplier <String> suadacao = () -> "Olá, seja bem-vindo (a)!";

    //     //Usando Supplier para obter uma lista com 5 suadações
    //     List <String> listaSuadacoes = Stream.generate(suadacao)
    //         .limit(5)
    //         .collect(Collectors.toList());

    //     //Imprimir as suadações geradas
    //     listaSuadacoes.forEach(System.out :: println);
    // }

    //Segundo Método
    public static void main(String[] args) {
        //Usando Supplier com uma classe anônima para fornecer uma saudação personalizada
        Supplier <String> saudacao = new Supplier<String>() {

            //Método criando a saudação no Supplier automática
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        };

        //Usar o Supplier para obter uma lista com 5 suadações
        List <String> listaSaudacoes = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i ++) {
            listaSaudacoes.add(saudacao.get());
        }

        //Imprimir as saudações geradas
        for (String saudacaoGerada : listaSaudacoes) {
            System.out.println(saudacaoGerada);
        }
    }
}
