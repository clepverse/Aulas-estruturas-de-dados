package ArvoreBinaria;

public class NoTree {

    public int info, dobro;
    public NoTree L, R;

    public NoTree ( int v , int d){
        info = v;
        dobro = d;
        L = null;
        R = null;
    }

    public NoTree (){
        L = null;
        R = null;
    }

}
