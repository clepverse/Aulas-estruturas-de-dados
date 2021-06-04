package application;

public class ArrayVetor {

    private double[] elementos;
    private int tamanho;

    public ArrayVetor(int capac){
        this.elementos = new double[capac];
        this.tamanho = 0;
    }

    public boolean adiciona(double elemento) {
        this.aumentaCap();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }


    public boolean adiciona(int posi, double elemento){

        if (!(posi >= 0 && posi < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCap();

        for (int i=this.tamanho-1; i>=posi; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posi] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCap(){
        if (this.tamanho == this.elementos.length){
            double[] elementosNovos = new double[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Método get
    public double get(int posi){
        if (!(posi >= 0 && posi < tamanho)){
            System.out.println("Posição inválida");
        }
        return this.elementos[posi];
    }



    //Método remove
    public double remove(int posi){
        if (!(posi >= 0 && posi < tamanho)){
            System.out.println("Posição inválida");
        }
        for (int i=posi; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        return this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }

    //Método set
    public double set(int posi, double nValor) {
        double valor;
        valor = elementos[posi];
        elementos[posi] = nValor;
        System.out.println("Antigo valor: "+valor+"Novo valor: "+nValor);
        return valor;
    }

    //Método média
    public double media() {
        double soma = 0;
        for (int i = 0; i < this.tamanho; i++) {
            soma += get(i);
        }
        return soma / this.tamanho;
    }

    //Método toString
    public String toString() {
        StringBuffer sf = new StringBuffer();
        sf.append("[");
        for (int i = 0; i < this.tamanho(); i++) {
            sf.append(elementos[i] + " ");
        }
        sf.append("]");
        return sf.toString();
    }

	/*public int get(double elemento){
	for (int i=0; i<this.tamanho; i++){
		if (this.elementos[i].equals(elemento)){
			return i;
		}
	}
	return -1;
	}*/

	/*@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}*/

}