package heterogenea;

import java.util.Scanner;

public class Programa_ECHete {

    public static char menu(){
        char op ='?';


        return op;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Aluno [] a1;
        a1 = new Aluno [50];
        a1[0] = new Aluno();
        //a1[0].notas = new double[3];
        a1[0].nome = "Pedro";
        System.out.print("Digite a matrícula: ");
        a1[0].matricula = leia.nextInt();
        //a1[0].matricula = 123;
        //a1[0].disc = new Disciplinas();
        a1[0].disc.d1 = "Matemática";
        a1[0].disc.d2 = "Física";
        a1[0].disc.dOpc[0] = "Computação";

        a1[1] = new Aluno();
        //a1[1].disc = new Disciplinas();
        //System.out.println("a1[1]: " + a1[1]);
        a1[1].nome = "Maria";
        a1[1].disc.d1 = "Matemática II";

        a1[0].notas[0] = 9.8;
        System.out.println(a1[0].nome);
        System.out.println(a1[0].matricula);
        System.out.println(a1[0].notas[0]);



        for (int i = 0; i < a1[0].notas.length; i++) {
            System.out.println("Nota "+(i+1)+" : " + a1[0].notas[i]);
        }
        System.out.println("Disciplina 1: "+ a1[0].disc.d1);
        System.out.println("Disciplina 2: "+ a1[0].disc.d2);
        for (int i = 0; i < a1[0].disc.dOpc.length; i++) {
            if (a1[0].disc.dOpc[i] != null)
                System.out.println("Disc. Opc "+(i+1)+" : " + a1[0].disc.dOpc[i]);
        }
    }

}
