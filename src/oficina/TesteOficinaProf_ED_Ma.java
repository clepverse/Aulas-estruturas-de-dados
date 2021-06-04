package oficina;

import EstruturaDeDados.Pessoa;
import oficina.Lista_array_Pessoa;

import java.util.Random;
import java.util.Scanner;

public class TesteOficinaProf_ED_Ma {

    public static void main(String[] args) {

        Pessoa a, b, c, d;

        a = new Pessoa("Pedro", 18 );
        c = new Pessoa("Maria", 23 );
        b = a;

        c.setIdade(30);
        b.setIdade(21);
        System.out.println("a: " +  a );
        System.out.println("b: " +  b );
        System.out.println("c: " +  c );

        Lista_array_Pessoa lp;

        lp = new Lista_array_Pessoa();

        lp.addLast(a);
        lp.addLast(c);

        d = lp.getLast();
        System.out.println("d: " +  d );
        System.out.println( lp );

        System.out.println("==============  Lista de Pessoas ============");
        String[] nomes = {
                "Adriana",
                "Aldo",
                "Alesson",
                "Alexandre",
                "Alexandre",
                "Alysson",
                "André",
                "Andréa",
                "Angelica",
                "Antonio",
                "Ariston",
                "Arllon",
                "Breno",
                "Carlos",
                "Darliane",
                "Diogo",
                "Emilly",
                "Fabiano",
                "Gabriel",
                "Gabrielle",
                "Guilherme",
                "Henrique",
                "Isaac",
                "Isadora",
                "Jean",
                "João",
                "José",
                "Leandro",
                "Lucas",
                "Luiz",
                "Marcelo",
                "Maria",
                "Mariane",
                "Matheus",
                "Pablo",
                "Paulo",
                "Pedro",
                "Rebeka",
                "Rivaldo",
                "Ronald",
                "Salomao",
                "Saulo",
                "Thiago",
                "Tulio",
                "Victor",
                "Vinícius"
        };
        Scanner leia =  new Scanner(System.in);
        lp = new Lista_array_Pessoa();
        System.out.println( lp );
        Random sort = new Random();
        //System.out.println( sort.nextInt(30) );
        Pessoa p;
        for (int i = 0; i < nomes.length; i++) {
            //p = new Pessoa( nomes[i] , 40 + sort.nextInt(40) );
            //lp.addLast(p);
            lp.addLast( new Pessoa( nomes[i] , 40 + sort.nextInt(40) ) );
        }
        System.out.println( lp );
        System.out.println( "Tamanho da lista: " + lp.size() );
        Lista_array_Pessoa lpIdadeMais;
        // lpIdadeMais = lp.getListaIdadeMais(idade);
        // Perguntar a idade inicial (inclisive)
        // Gerar a lista lpIdadeMais
        // imprimir essa lista na forma de relatório:
        // NOME  -  IDADE
        // Pedro - 75
        // Maria - 68
        // ...
        System.out.print("Digite a idade limite: ");
        int idade = leia.nextInt();
        lpIdadeMais = new Lista_array_Pessoa();
        System.out.println( lpIdadeMais );
        for (int i = 0; i < lp.size(); i++) {
            if ( lp.get(i).getIdade() >= idade )
                lpIdadeMais.addLast( lp.get(i) );
        }
        System.out.println( lpIdadeMais );
        System.out.println( "Tamanho da lista (lpIdadeMais): " + lpIdadeMais.size() );
        System.out.println("\n---- Relatório----");
        System.out.println("   NOME     - IDADE");
        for (int i = 0; i < lpIdadeMais.size(); i++) {
            //System.out.println(lpIdadeMais.get(i).getNome() + " - " + lpIdadeMais.get(i).getIdade() );
            System.out.print(lpIdadeMais.get(i).getNome() );
            for (int j = 0; j < (12 - lpIdadeMais.get(i).getNome().length() ); j++) {
                System.out.print(" ");
            }
            System.out.println("-  " + lpIdadeMais.get(i).getIdade() );
        }

    }

}