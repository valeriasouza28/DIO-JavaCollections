package org.example;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main (String[] args) {

        /*Dada uma lista com 7 noatas do aluno [7, 8.5, 9.3, 5, 7, 0, 3.6],faça:*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição  da nota 5.0:  " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posçião 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }

        System.out.println("\nExiba a soma dos valores:" + soma);

        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));

        // Removemos o elemento na posição 6 que corresponde ao sétimo elemento na List
        System.out.println("\nRemova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        //Removemos a nota da posição 0 que corresponde a primeira nota  da List
        System.out.println("\nRemova a nota  da posição 0: ");
        notas.remove(0);
        //Exibindo as notas da list
        System.out.println(notas);

        //Remova as notas menores que 7 e exiba a lista
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        // Exibe a List, com os elementos maiores que 7, e os elementos menores que 7 foram removidos.
        System.out.println(notas);

        //Apagando todos os elementos da List
        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        //Verificar se a lista está vazia usando o método isEmpty se estiver  vazia true, ou false caso contenha elementos
        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());


    }
}