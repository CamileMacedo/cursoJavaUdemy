package aulas.caixa;

public class Caixa {
    private  Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionar (Object nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object getConta(int posicao){
        return this.objetos[posicao];
    }
}
