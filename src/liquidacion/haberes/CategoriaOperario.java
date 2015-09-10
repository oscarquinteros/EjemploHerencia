/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion.haberes;

import liquidacion.personal.Empleado;
import liquidacion.personal.Operario;

/**
 *
 * @author oscarquinteros
 */
public class CategoriaOperario extends Categoria{

    public Float calculo(Empleado empleado) {
        Float resultado=new Float(1000.00);
        Operario op = (Operario)empleado;
        if (op.getTurno().equals("NOCHE")){
            resultado=resultado+new Float(500.00);
        }
        return resultado;
    }
    
}
