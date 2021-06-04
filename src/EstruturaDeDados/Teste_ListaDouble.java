package EstruturaDeDados;

public class Teste_ListaDouble {

    public static void main(String[] args) {

        Lista_array a;
        a = new Lista_array();

        a.addLast(23);
        a.addLast(56);
        a.addLast(34);
        a.addLast(87);
        a.addLast(12);
        System.out.println( a );
        System.out.println("Primeiro: " + a.getFirst());
        System.out.println("Último  : " + a.getLast());

//		System.out.println("---- extremos() -----");
//		a.extremos();
        Lista_ponteiro b;
        b = new Lista_ponteiro();

        b.addLast(23);
        b.addLast(56);
        b.addLast(34);
        b.addLast(87);
        b.addLast(12);
        System.out.println( b );
        System.out.println("Primeiro: " + b.getFirst());
        System.out.println("Último  : " + b.getLast());
        b.removeFirst();
        System.out.println( b );
        b.removeLast();
        System.out.println( b );
        b.addFirst(5);
        System.out.println( b );



    }

}


