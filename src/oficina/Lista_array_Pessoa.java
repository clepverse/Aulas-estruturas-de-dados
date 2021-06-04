package oficina;

import EstruturaDeDados.Pessoa;

public class Lista_array_Pessoa {
    private Pessoa[] vet;
    private int max, livre;

    public Lista_array_Pessoa (){
        max = 1000;
        vet = new Pessoa[max];
        livre = 0;
    }

    public Lista_array_Pessoa ( int maxElementos){
        max = maxElementos;
        vet = new Pessoa[max];
        livre = 0;
    }

    public void addLast( Pessoa v ){
        if ( livre < max ) {
            vet[livre] = v;
            livre++;
        } else
            System.out.println("Lista cheia!!!");
    }

    public Pessoa get ( int i ) {
        // implementar
        if ((i >= 0) && (i < size() )) {
            return vet[i];
        } else {
            System.out.println("Elemento não consta da lista!!!");
            return null;
        }
    }

    public int size(){
        // implementar
        return livre;
    }

    public Pessoa getLast() {
        // implementar
        if ( size() != 0 ) {
            return vet[ livre - 1 ];
        }
        else {
            System.out.println("Lista vazia!!!");
            return null;
        }
    }

    public Pessoa getFirst() {
        // implementar
        if ( size() != 0 ) {
            return vet[ 0 ];
        }
        else {
            System.out.println("Lista vazia!!!");
            return null;
        }
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

    @Override
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < size(); i++) {
            res = res + "[ "+get(i)+" ]  ";
        }
        res = res + "]";
        return res;
    }


    public Lista_array_Pessoa getListaIdadeMais ( int idade ){
        // Implementar
        Lista_array_Pessoa res;
        res = new Lista_array_Pessoa();
        for (int i = 0; i < size(); i++) {
            if ( get(i).getIdade() >= idade ) {
                res.addLast( get(i) );
            }
        }
        return res;
    }

}
