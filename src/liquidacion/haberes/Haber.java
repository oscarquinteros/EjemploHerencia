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
public abstract class Haber {
    public abstract Float calculo(Empleado empleado);
}
