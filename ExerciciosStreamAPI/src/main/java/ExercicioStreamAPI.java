import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String:");
        numerosAleatorios.forEach(System.out::println);

        /*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());*/

//        System.out.println("Transforme essa lista de String em uma lista de números inteiros.");
//        List<Integer> collectList = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);

        /*System.out.println("Pegue os números pares e maiores que dois e coloque em uma lista.");
        List<Object> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> (integer % 2 == 0 && integer > 2) )
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*/

        /*System.out.println("Mostre a média dos números.");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt
                .average()
                .ifPresent(System.out::println);*/

        System.out.println("Remova os valores impares.");
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));

        System.out.println(numerosAleatoriosInteger);






    }// fim do main
}//fim da classe ExeciciosStreamAPI
