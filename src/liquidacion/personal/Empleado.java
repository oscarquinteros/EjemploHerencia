/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion.personal;

import java.util.ArrayList;
import liquidacion.haberes.Haber;

/**
 *
 * @author oscarquinteros
 */
public abstract class Empleado extends Persona{
    private Integer nroLegajo;
    private ArrayList haberes= new ArrayList();
    public Empleado(Integer dni,String apellido,String nombre,Integer nroLegajo){
        super(dni,apellido,nombre);
        this.nroLegajo=nroLegajo;
    }
    public Empleado(Integer dni,String apellido,String nombre){
       super(dni,apellido,nombre); 
    }
    /**
     * @return the nroLegajo
     */
    public Integer getNroLegajo() {
        return nroLegajo;
    }

    /**
     * @param nroLegajo the nroLegajo to set
     */
    public void setNroLegajo(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    public void addHaberes(Haber haber){
        this.haberes.add(haber);
    }
    public Float liquidarHaberes(){
        Float resultado = new Float(0);
        for (Object haber : haberes) {
            resultado = resultado+((Haber)haber).calculo(this);
        }
        return resultado;
    }
    
}
