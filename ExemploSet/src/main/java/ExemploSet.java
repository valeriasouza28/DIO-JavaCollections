import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("\nCrie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d,0d, 3.6));
        System.out.println(notas.toString());

        //Não consiguimos mexer dessa maneira  no Set, por nnão  índex, não tem posições
        /*System.out.println("Exiba a posição da nota 5.0: ");*/

        //Não consiguimos mexer dessa maneira  no Set, por nnão  índex, não tem posições
        /*System.out.println("Adicione na lista a nota 8.0 na posição 4.0: ");*/

        //Não consiguimos mexer dessa maneira  no Set, por nnão  índex, não tem posições
        /*System.out.println("Substitua a nota 5.0 pela nota 6.0: ");*/

        System.out.println("\nConfira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //Não consiguimos mexer dessa maneira  no Set, por nnão  índex, não tem posições
        /*System.out.println("Exiba a terceira nota adicionada: ");*/

        //Utilizamos Collections.min(notas) para exibibir a menor nota
        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        //utilizamos Collections.max(notas) para exibir a maior nota
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Vamos usar o iterator para exibir a soma  dos elementos dentro do conjunto
        //Digitando notas.iterator(); para colocar dentrode uma variável e pressionana ctrl+Alt+V para colocar dentro de uma variável
        Iterator<Double> iterator = notas.iterator();
        //Criamos uma váriavel soma para controle
        Double soma = 0.0;

        // Criamos um laço while e usamos iterator.hasNext(), para verificar se dentro da Set há um próximo elemento
        while (iterator.hasNext()){

            //Digitamos iterator.next(); e presionamos ctrl+Alt+V e enter para colocar dentro de uma variável
            Double next = iterator.next();

            //E soma o próximo elemento com  o valor da soma
            soma += next;
        }
        // E imprimimos a soma
        System.out.println("Exiba a soma dos valores: " + soma );

        //\a média das notas é a soma das notas dividido pela quantidade de elementos que é feita utlizando notas.size();
        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0.0: ");

        //Removendo a nota ).0
        notas.remove(0d);

        //Exibindo a Set após remoção
        System.out.println(notas);

        //Não consiguimos mexer dessa maneira  no Set, por nnão  índex, não tem posições
        /*System.out.println("Remova a nota na posição 0: ");*/
            System.out.println("Remova as notas menoores que 7 e exiba na lista Set: ");

        //digitamos notas.iterator(); e pressiiona ctrl+Alt+V para criar uma variável
        Iterator<Double> iterator1 = notas.iterator();
        //Criamos um laço while que irá rodar enquanto iterator1 tiver proóximo elemento
        while (iterator1.hasNext()){
            //Digitamos iterator.next(); e pressiona ctrl+Alt+V para colocar dentro da variável
            Double next = iterator1.next();
            //Criamos um if com a condição de que o prŕoximo elemento exibido for menor que 7 será removido
            if (next < 7) iterator1.remove();

        }

        //Exibindo ListSet após remover a as notas menores do que 7
        System.out.println(notas);

        /*para exibir a HashSet não exibe a odem em que foi informada, já que só executa Set de maneira aleatória,
        * teremos que usar uma  LinkedHashSet*/
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        LinkedHashSet notas2 = new  LinkedHashSet<>();
        //Adiciona notas a List LinkedSet
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        //Exibe as notas na ordem de inserção mas não, repete as notas inseridas  de forma duplicada
        System.out.println(notas2);

        //Vamos utilizar TreeSet, porque ele ordena os elementos pela ordem natural, String ordena na ordem alfatica, ordem numérica

        System.out.println("Exiba todas aas notas na ordem crescente: ");
        //Criamamos um TreeSet e passamos como argumento
        Set<Double> notas3 = new TreeSet<>(notas2);
        //Exibindo a TreeSet notas3
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        //Para Apagar o conjunto inteiro com clear()
        notas.clear();

        //Conferimos se o conjuntos está vazio com isEmpty()
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());




    }
}
