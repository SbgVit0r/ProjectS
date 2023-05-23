/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

public class Mago extends UnidadeAbstrata {
    private float dMagico;

    public float getdMagico() {
        return dMagico;
    }

    public void setdMagico(float dMagico) {
       this.dMagico = getDano()*2.75f;
    }
    
    @Override
    public void calculoDanoM(float danoM) {
     danoM = getdMagico() - getDefesaM()/4;
    }

    @Override
    public void calculoDano(float danoF) {
        
    }


    
    
}

