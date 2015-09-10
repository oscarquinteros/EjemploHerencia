/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion.haberes;

import liquidacion.personal.Empleado;

/**
 *
 * @author oscarquinteros
 */
public class SueldoBasicoAdminitrativo extends SueldoBasico{

    
    public Float calculo(Empleado empleado) {
        return new Float(5500);
    }
    
}
