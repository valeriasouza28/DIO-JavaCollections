import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        /* Dada os modelos dos carros e seus  respectivos consumos na estrada faça:
         * modelo = gol - consumo = 14,4 Km/l
         * modelo = uno - consumo = 15,6 Km/l
         * modelo = mobi - consumo = 16,1 Km/l
         * modelo hb20 - consumo = 14,5 Km/l
         * modelo kwid - consumo = 15, 6 Km/l
         * */

        System.out.println("Crie um dicionário que relacione os modelos e seus resoectivos consumos: ");
        //Criando um Map <String, Double> é o tipo da chave eo tipo do valor
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            // usamos o método put() para adicionar elementos a Map, e dentro do put passa a chave e o valor
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwd", 15.6);
        }};

        //Exibindo a Map carrosPopularaes após a adiçao de elementos, passando a variável carrosPopulares:
        //Note que a ordem de exibição é a leatória por ser um HashMap
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 Km/l: ");
        /*Não podemos utilizar chave repetidas para fazer a substituição usando modo put()
         * como já temos a chave "gol" vamos a apenas sobrescerever o seu valor.*/
        carrosPopulares.put("gol", 15.2);
        //Imprimindo a Map após a substituição da chave "gol"
        System.out.println(carrosPopulares.toString());

        /*Para sanere se tucson que é um modelo de carroa está dentro do dicionário de carros
         * sabendo que modelo é utilizado dentro da chave na Map, usamos o método contaisnsKey("tucson")
         *  onde tucson representa a chave que  quero saber se tem no meu dicionário, se tiver a chave
         * tucson retornará true, caso não tenha retornará false.*/
        System.out.println("Confira se  o  modelo tuncson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        /*Para que eue possa passar uma chave de um elemento e me retornar o valor desse elemento
         * usamos o método get() e passamos um objeto que é a chave do elemento*/
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //Não temos  um métodoo que possa ser adicionado para exibir já que a exibição é feita em ordem aletória
        /*System.out.println("exiba o terceiro modelo adicionado: ");*/

        System.out.println("Exiba  os  modelos: ");
        /* Para exeibir os modelos existe o método keySet para mostrar o modelo que é a chave da Map
        pegamos carrosPopulares.keySet(); e colocamos dentro de uma variável que vai retornar uma Set
        do tipo String, porque as chaves são do tipo String
         */
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);


        System.out.println("Exiba  o consumo dos carros: ");
        /*Para saber o consumo desse carro dentro da Hashmap utilizamos os valores
         * da Set, que os seus valores correspondem ao consumo dos carros utilizando
         * o método values(), pegamos carrosPopulares.values(); e colocamos dentro
         * de uma variável*/
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("exiba o modelo mais econômico e seu consumo: ");
        /*Nas chaves  da temos  o modelo dos carros e nos valores temos o consumo,
         * logo temos de que descobrir qual o maior consumo (valor) e seu modelo (chave)  */
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        /*Esse métodoo entrySet() retorna um Set e os elementos dentro desse Set
         * é do tipo entry para.*/
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        //Variável de controle
        String modeloMaisEficiente = "";

        /*Cada elemento dentro do Entry*/
        for (Map.Entry<String, Double> entry : entries) {

            /*Se o elemento for  igual  ao connsumomaisEficiente  eu posso dizer que o modeloMaisEficiente é igual a chave referente ao entry  */
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }


        System.out.println("Exiba um modelo de consumo menos econômico: ");
      /*Para fazer isso temos que trabalhar com a chave e comno valor separadamente, lembrando que o método values() retorna uma Collrction e o método keySet retorna um Set com os modelos, e o values uma Collection de valores.
  Precisamos trabalhar com eles separadamente mas que tenha ligação entre eles  */
// vemos qual o menor consumo
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        /*Esse método bai me retotnar um Set e dentro desse Set vai retornar chaves e valores separadamente*/

        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            carrosPopulares.entrySet();
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

            Iterator<Double> iterator = carrosPopulares.values().iterator();
            Double soma = 0d;
            while(iterator.hasNext()){
                soma += iterator.next();
            }
            System.out.println("Exiba as soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos desses dicionários: " + (soma/carrosPopulares.size()));

        System.out.println("Antes da remoção: " + carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15, 6 Km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba  todos os carros na ordem em que foram  informados: " );
        //Usando LinkedHshMap para colocar na ordem de inserção
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            // usamos o método put() para adicionar elementos a Map, e dentro do put passa a chave e o valor
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwd", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        TreeMap<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());


    }
    }
