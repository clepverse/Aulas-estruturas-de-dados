package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Stack;

public class Teste_Pilha2021 {

    public static void main(String[] args) {

        LinkedList <Character> a = new LinkedList <Character>();
        Stack p = new Stack ();
        Pilha_array pa = new Pilha_array(6);


        p.push('L');
        p.push('e');
        System.out.println( p );
        System.out.println("topo de p: " +  p.peek() );

        System.out.println( pa );
        System.out.println("pa underflow: " +  pa.underflow() );
        System.out.println("pa overflow : " +  pa.overflow() );
        pa.push('L');
        pa.push('e');
        System.out.println( pa );
        System.out.println("pa underflow: " +  pa.underflow() );
        System.out.println("pa overflow : " +  pa.overflow() );

        System.out.println("topo de pa: " +  pa.top() );
        pa.push('o');
        pa.push('p');
        pa.push('.');
        System.out.println( pa );
        System.out.println("pa underflow: " +  pa.underflow() );
        System.out.println("pa overflow : " +  pa.overflow() );
        pa.push('!');
        System.out.println( pa );




        System.out.println( a );

        a.addFirst('A');
        a.addLast('B');
        System.out.println( a );

        // [ A B ]
        System.out.println( "retorno da posição(1): " + a.set(1,'C') );
        System.out.println( a );
        System.out.println( "retorno da posição(1): " + a.set(1,'X') );
        System.out.println( "Posição(1): " + a.get(1) );

        System.out.println( a );


        // Teste de Pilha

        String frase = "A casa é verde.", expr="(a+b*(2/3)-((2*3)+5))";

        System.out.println( frase.charAt(2) );
        System.out.println("Tamanho da frase = " + frase.length() );
        System.out.println( frase.charAt(14) );


    }

}


