import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        /*Dadas as seguintes informações sobre as minhas séries favoritas,
        * crie um conjunto e ordene este conjunto exibindo:
        * (nome- genero - tempo do epsodio);
        *
        * Série 1 = Nome: got, genero: fantasia, tempoEpsodio: 60
        * Série 2 = Nome: dark, genero: drama, tempoEpsodio: 60
        * Série 3 =  nome: that '70 show, genero: comédia,, tempoEpsódio: 25
        * */

        System.out.println("--\tOrdem aleatória\t--");
        //Criamos hashSet da classe Serie
        Set<Serie> minhasSeries1 = new HashSet<>(){{

            add(new Serie("got", "fantasia", 60));
            add( new Serie("dark", "drama", 60));
            add(new Serie("that '70 show", "comédia", 25));

        }};
                //imprimimos  na ordem aleatória usando HashSet fazendo
        // for-each usando como variável de iteração serie iteragindo com minhasSeries
                for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoDeEpisodio());

                //Fazemos na ordem de insrção usando LinkedHashSet, já que no HashSet utiliza a ordem aleatória
        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries = new LinkedHashSet<>(){{

            add(new Serie("got", "fantasia", 60));
            add( new Serie("dark", "drama", 60));
            add(new Serie("that '70 show", "comédia", 25));

        }};
        //imprimimos fazendo for-each usando como variável de iteração serie iteragindo com minhasSeries
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoDeEpisodio());

        System.out.println("--\tOrdem Natural (TempoDeEpisodio)\t--");
        //Usamos TreeSet para organizar por ordem natural TempoDeEpisedio, na ordem numérica
        /*Não dá para fazer isso sem o comparable  então implementamos o comparable na
        class Serie implements Comparable<Serie>, e pressionando Alt+enter, e clica em Ok.

        Ao executar não irá exibir a série que contém mesmo TempoDeEpisodio, porque a Set não exibe
        conteúdos iguais.
         Portanto colocamos dentro do bloco compareTo da classe serie o comando
         public int compareTo(Serie serie) {
        int tempoDeEpisodio = Integer.compare(this.getTempoDeEpisodio(), serie.getTempoDeEpisodio());
        if(tempoDeEpisodio != 0) return tempoDeEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
    No caso se o Tempo de espisodio da serie forem iguais a comparação será feita por gênero em ordem alfabetica
    */
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoDeEpisodio());

        System.out.println("--\tOrdem Nome/Genero/TempoDeEpsodio\t--");
        /*Criamaos uma classe  ComparatorNomeGeneroTempoDeEpisodio e implementamos o Comparator,
        * Onde vamos comparar por nome, genero e tempoDeEpisodio, se os nomes das minha series
        * houver nomes diferentes, será comparado por nome, mas caso haja nomes iguais, tentará a comparação
        * por generos, se houver generos diferentes, mas caso houver generos iguais, se houver series e
        * generos iguais a comparação será feita por tempoDeEpisodios, se nomes generos e tempoDeEpsodio
        * sejam iguais a serie será a mesma  */
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoDeEpisodio());

        /*Vamos adicionar elemento dentro de Treeset utilizando o método addAll e como argumeneto
         passamos minhasSeries, mas quando minhaSeries ser adicionada a minhasSeries3, será
          organizada por nome genero e tempoDeEpsodio*/
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoDeEpisodio());


    }
}

//Criamos uma classe para colocar os atributos que uma série possa ter
class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private Integer tempoDeEpisodio;

    // Pressionamos Alt+Insert para utilizar o construtor, selecionamos os trẽs atributos
    public Serie(String nome, String genero, Integer tempoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    //Fazemos os Getters pressionando Alt+insert selesiona Getter, seleciona os três atributos

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    //Sobescreve o toString pressionando Alt+inset, seleciona toString(), seleciona oss três atributos

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpisodio=" + tempoDeEpisodio +
                '}';
    }

    /*Sobrescreve  os  métodos equals and hashcode, pressionando Alt+insert,
    seleciona, clica em próximo, próximo, seleciona os  três atributos, clica em create*/

    /*Colocamos o que queremos que seja feita as comparações do hashCode,
    * que é por  nome, generero, e tempoDeEpsodio. E o equals é quem faz essa verficação
    * se o objeto que eu estou pesquiisando tem um hashCode dentro da minha classe.*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoDeEpisodio.equals(serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoDeEpisodio = Integer.compare(this.getTempoDeEpisodio(), serie.getTempoDeEpisodio());
        if(tempoDeEpisodio != 0) return tempoDeEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoDeEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;


        return Integer.compare(s1.getTempoDeEpisodio(), s2.getTempoDeEpisodio());

    }
}