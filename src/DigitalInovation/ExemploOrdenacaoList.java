package DigitalInovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural(nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem idade\t--");
        Collections.sort(meusGatos, new ComparatorIdade());
        /*meusGatos.sort(new ComparatorIdade());*/
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t--");
        Collections.sort(meusGatos, new ComparatorCor());
        /*meusGatos.sort(new ComparatorCor());*/
        System.out.println(meusGatos);

        System.out.println("--\tOrdem nome/idade/cor\t--");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        /*meusGatos.sort(new ComparatorCor());*/
        System.out.println(meusGatos);


    }
}
