
package Principal;

public class Guerreiro extends UnidadeAbstrata {
    private float dFisico; 

    public float getdFisico() {
        return dFisico;
    }

    public void setdFisico(float dFisico) {
        this.dFisico = getDano()*1.95f;
    }
      
    @Override
    public void calculoDano(float danoF) {
        danoF = getDano()-getDefesa()/2;
    }

    @Override
    public void calculoDanoM(float danoM) {
        
    }
    
}
