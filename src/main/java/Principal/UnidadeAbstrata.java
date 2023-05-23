
package Principal;

public abstract class UnidadeAbstrata {
    private String nome, classe;
    private float defesa, defesaM, dano;

    public float getDano() {
        return dano;
    }

    public void setDano(float dano) {
        this.dano = 2.00f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public float getDefesa(){
        return defesa;
    }
    
    public void setDefesa(float d){
        this.defesa = d;
    }
    
     public float getDefesaM(){
        return defesaM;
    }
    
    public void setDefesaM(float dm){
        this.defesaM = dm;
    }
    
    public abstract void calculoDano(float danoF);
    public abstract void calculoDanoM(float danoM);
}
