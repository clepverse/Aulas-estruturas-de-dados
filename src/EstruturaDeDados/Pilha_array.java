package EstruturaDeDados;

public class Pilha_array {
    private char[] vet;
    private int max, livre;

    public Pilha_array (){
        max = 1000;
        vet = new char[max];
        livre = 0;
    }

    public Pilha_array ( int maxElementos){
        max = maxElementos;
        vet = new char[max];
        livre = 0;
    }

    public boolean underflow(){
        if ( size() == 0 )
            return true ;
        else
            return false;
        // return ( size() == 0 );
    }

    public boolean overflow(){
        return ( size() == max );
    }

    public void push( char v ){
        if ( livre < max ) {
            vet[livre] = v;
            livre++;
        } else
            System.out.println("Pilha cheia!!!");
    }

    public void addFirst( char v ){
        //implementar
        if ( livre < max ) {
            for (int i = livre; i > 0; i--) {
                vet[i] = vet[i-1];
            }
            vet[0] = v;
            livre++;
        } else
            System.out.println("Lista cheia!!!");

    }

    public char removeFirst( ){
        //implementar
        char inicio = vet[0];
        if ( size() != 0 ) {
            for (int i = 0; i < livre; i++) {
                vet[i] = vet[i+1];
            }
            livre --;
            return inicio;
        } else {
            System.out.println("Lista vazia !!!");
            return 0;
        }
    }

    public char pop( ){
        //implementar
        if ( size() != 0 ) {
            livre --;
            return vet[livre];
        } else {
            System.out.println("Pilha vazia !!!");
            return 0;
        }
    }

    public char get ( int i ) {
        // implementar
        if ((i >= 0) && (i < size() )) {
            return vet[i];
        } else {
            System.out.println("Elemento não consta da lista!!!");
            return 0;
        }
    }

    public int size(){
        // implementar
        return livre;
    }

    public char top() {
        // implementar
        if ( size() != 0 ) {
            return vet[ livre - 1 ];
        }
        else {
            System.out.println("Pilha vazia!!!");
            return 0;
        }
    }

    public char getFirst() {
        // implementar
        if ( size() != 0 ) {
            return vet[ 0 ];
        }
        else {
            System.out.println("Lista vazia!!!");
            return 0;
        }
    }


    @Override
    public String toString() {
        String res = "BASE>>[ ";
        for (int i = 0; i < size(); i++) {
            res = res + get(i) + " ";
        }
        res = res + "]<<TOPO";
        return res;
    }

    /*
     * Supondo que a lista seja: [ 23.0, 56.0, 34.0, 87.0, 12.0 ]
       Na hora que for chamada a operação, será exibido na tela de saída: [ 23.0; 12.0 ]

     */
    public void extremos(){
        if ( size() != 0 ) {
            System.out.println("[ "+ vet[0] +"; "+vet[livre-1]+" ]");
        }
        else System.out.println("Lista Vazia!");
    }

}
