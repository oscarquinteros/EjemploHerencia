/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion;

import liquidacion.haberes.CategoriaOperario;
import liquidacion.haberes.SueldoBasicoOperario;
import liquidacion.personal.Operario;

/**
 *
 * @author oscarquinteros
 */
public class Liquidacion {
    /**
     * @param args the command line arguments
     */		
    public static void main(String[] args) {
        Liquidador liq=new Liquidador();
        SueldoBasicoOperario sbo = new SueldoBasicoOperario();
        CategoriaOperario cat = new CategoriaOperario();
        Operario op = new Operario(1,"Juan","Ponce",2,"NOCTURNO");
        op.addHaberes(sbo);
        op.addHaberes(cat);
        liq.agregarEmpleado(op);
        System.out.println(liq.liquidar()); 		              
    }
    
}
