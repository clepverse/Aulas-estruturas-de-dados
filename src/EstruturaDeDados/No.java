package EstruturaDeDados;

public class No {

    public double info;
    public No prox;

    public No ( double v ){
        info = v;
        prox = null;
    }

    public No ( double v, No p ){
        info = v;
        prox = p;
    }

    public No ( ){

    }

}

