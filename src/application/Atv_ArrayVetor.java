package application;

import java.util.Scanner;

class TrabalhoEdFuncionarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista_array lista = new Lista_array();

        //double salario;

        System.out.println("Informe o número de empregados que deseja cadastrar: ");
        int num = scanner.nextInt();

        // Adicionando os salários
        for (int i = 0; i < num; i++) {
            System.out.println("Informe o " + (i + 1) + "º salário do empregado:");
            double salario = scanner.nextDouble();
            lista.addLast(salario);
        }

        System.out.println("\n-------------------------------------------------");

        // Removendo salário
        System.out.println("\nDeseja remover algum salário? S - sim / N - não");
        char x = scanner.next().charAt(0);
        if (x == 'S' || x == 's') {
            System.out.println("\nLista dos salários: " + lista.toString());
            System.out.println("\nQual posição do salário que deseja remover? [0 a "+(lista.size()-1)+"]");
            int posicao = scanner.nextInt();
            System.out.println("\nO salário removido foi: "+lista.remove(posicao));
        } else if (x == 'N' || x == 'n') {
            System.out.println("\nOk. Nenhum salário foi removido!");
        }

        System.out.println("\n-------------------------------------------------");

        // Alterando salário
        System.out.println("\n\nDeseja alterar algum salário? S - sim / N - não");
        char y = scanner.next().charAt(0);
        if (y == 'S' || y == 's') {
            System.out.println("\nLista dos salários: " + lista.toString());
            System.out.println("\nQual posição do salário que deseja alterar? [0 a "+(lista.size()-1)+"]");
            int posicao = scanner.nextInt();
            while (!(posicao >= 0 && posicao < (lista.size()))) {
                System.out.println("Informe uma posição válida:");
                posicao = scanner.nextInt();
            }
            System.out.println("\nQual o novo valor que deseja inserir?");
            double novoValor = scanner.nextDouble();
            lista.set(posicao, novoValor);
        } else if (y == 'N' || y == 'n') {
            System.out.println("\nOk. Nenhum salário foi alterado!");
        }

        // Fechando a entrada das informações
        scanner.close();

        // Imprimindo as informações
        System.out.println("\n\n=========== Relatório das Informações ===========");
        System.out.printf("Média dos salários: R$%.2f\n", lista.media());
        System.out.println("Quantidade de salário(s) acima da média: " + lista.quantSalariosAcimaMedia());
        System.out.printf("Primeiro salário da lista: R$%.2f\n", lista.getFirst());
        System.out.printf("Ultimo salário da lista: R$%.2f\n", lista.getLast());
        System.out.println("Lista dos salários: " + lista.toString());
        System.out.println("=================================================");
    }

}


class Lista_array {
    Scanner scanner = new Scanner(System.in);
    private double[] vet;
    private int max;
    private int livre;

    public Lista_array() { // construtor vazio
        max = 1000;
        vet = new double[max];
        livre = 0; // a posição livre máxima é 0
    }

    // Método para adicionar elementos na lista
    public void addLast(double elemento) {
        if (livre < max) {
            vet[livre] = elemento;
            livre++;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    // Método que retorna o índice
    public double get(int i) {
        if ((i >= 0) && (i < size())) {
            return vet[i];
        } else {
            System.out.println("Índice do vetor não encontrado!");
        }
        return 0;
    }

    // Método que retorna o tamanho da lista
    public int size() {
        return this.livre;
    }

    // Método para pegar o último elemento da lista
    public double getLast() {
        if (size() != 0) {
            return vet[livre - 1]; // pega a ultima posição
        } else {
            System.out.println("Lista vazia!");
            return 0;
        }
    }

    // Método para pegar o primeiro elemento da lista
    public double getFirst() {
        if (size() != 0) {
            return vet[0]; // pega o primeiro da lista
        } else {
            System.out.println("Lista vazia!");
            return 0;
        }
    }

    // Método remover
    public double remove(int posicao) {
        while (!(posicao >= 0 && posicao < size())) { // Enquanto acessar uma posição que não existe...
            System.out.println("Informe uma posição válida:");
            posicao = scanner.nextInt();
        }
        double removido = 0;
        removido = vet[posicao];
        for (int i = posicao; i < this.livre - 1; i++) {
            this.vet[i] = this.vet[i + 1];
        }
        livre--;
        return removido;
    }

    // Método SET
    public void set(int posicao, double novoValor) {
        double valor;
        valor = vet[posicao];
        vet[posicao] = novoValor;

        System.out.println("\nAntigo valor: "+valor+"\nNovo valor: "+novoValor);
    }


    // Método toString
    public String toString() {
        StringBuffer sf = new StringBuffer();
        sf.append("[ ");
        for (int i = 0; i < size(); i++) {
            sf.append(vet[i] + " ");
        }
        sf.append("]");

        return sf.toString();
    }

    //Método Média
    public double media() {
        double soma = 0;
        for (int i = 0; i < size(); i++) {
            soma += get(i);
        }

        return soma / size();
    }

    //Método salário acima da média
    public int quantSalariosAcimaMedia() {
        // Verificando a quantidade de salários que são acima da média
        int salariosAcimaMedia = 0;
        for (int i = 0; i < size(); i++) {
            if (get(i) > media()) {
                salariosAcimaMedia++;
            }
        }
        return salariosAcimaMedia;
    }
}
