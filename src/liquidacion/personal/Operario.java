/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidacion.personal;

/**
 *
 * @author oscarquinteros
 */
public class Operario extends Empleado{
    private String turno;

    public Operario(Integer dni, String apellido, String nombre, Integer nroLegajo,String turno) {
        super(dni, apellido, nombre, nroLegajo);
        this.turno=turno;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
