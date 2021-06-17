package DigitalInovation.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperaturasSemestral = new ArrayList<Double>();

        double soma = 0.0;

        for (int i = 1; i < 7; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = sc.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();

        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "C");
        System.out.println("----------");

        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " C");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " C");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " C");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
