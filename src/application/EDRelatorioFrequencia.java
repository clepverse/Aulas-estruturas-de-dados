package application;

import java.util.LinkedList;
import java.util.Scanner;

public class EDRelatorioFrequencia {

    public static void main(String[] args) {
        LinkedList<Double> list_valor = new LinkedList <>();
        LinkedList<Double> list_n_unic = new LinkedList <>();
        LinkedList<Double> list_n_rept = new LinkedList <>();

        int rept = 1;
        int cont = 0;
        double res;
        double soma = 0;
        double media = 0;

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o "+(i+1)+"º número da lista: ");
            res = s.nextDouble();
            list_valor.add((double) res);
            soma += list_valor.get(i);
            for(int j = 0; j < list_n_unic.size(); j++) {
                if(list_valor.get(i).equals(list_n_unic.get(j))) {
                    rept++;
                }
            }if(rept == 1) {
                list_n_unic.add((double)list_valor.get(i));
            }
            rept = 1;
        }
        s.close();
        for(int i = 0; i < list_n_unic.size(); i++) {
            for(int j = 0; j < list_valor.size(); j++) {
                if(list_n_unic.get(i).equals(list_valor.get(j))) {
                    cont++;
                    System.out.print(cont);
                }
            }
            list_n_rept.add((double) cont);
            cont = 0;
        }
        media = soma/10;

        System.out.println("============================");
        System.out.println("RELATÓRIO DE FREQUÊNCIA");
        System.out.println("============================");
        for(int i = 0; i < list_n_unic.size(); i++) {
            if(list_n_rept.get(i) == 1) {
                System.out.println(list_n_unic.get(i)+" - "+list_n_rept.get(i)+ " vez");
            }
            else {
                System.out.println(list_n_unic.get(i)+" - "+list_n_rept.get(i)+ " vezes");
            }
        }
        System.out.print("LISTA DE NÚMEROS: [");
        for(int i = 0; i <list_valor.size(); i++) {
            System.out.print(list_valor.get(i)+ " ");
        }
        System.out.println("]");
        System.out.println("MÉDIA: ["+media+"]");
    }
}
