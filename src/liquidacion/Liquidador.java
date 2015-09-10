/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion;

import java.util.ArrayList;
import liquidacion.personal.Empleado;


/**
 *
 * @author oscarquinteros
 */
public class Liquidador {
    private ArrayList empleados = new ArrayList();
    
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    public Float liquidar(){
        Float sumatoria=new Float(0);
        for (Object empleado : empleados) {
            sumatoria=sumatoria+((Empleado)empleado).liquidarHaberes();
        }
        return sumatoria;
    }
}
