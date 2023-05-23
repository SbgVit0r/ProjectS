
package Principal;

public class Arqueiro extends UnidadeAbstrata {
    private float dFisico;

    public float getdFisico() {
        return dFisico;
    }

    public void setdFisico(float dFisico) {
        this.dFisico = getDano()*1.75f;
    }

    @Override
    public void calculoDano(float danoF) {
        
    }

    @Override
    public void calculoDanoM(float danoM) {
    }
    
    
 
}
