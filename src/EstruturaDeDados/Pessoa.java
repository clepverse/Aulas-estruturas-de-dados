package EstruturaDeDados;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private char sexo;

    public Pessoa(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, double altura, char sexo) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        //return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
        return nome + " - " + idade;
    }


}



