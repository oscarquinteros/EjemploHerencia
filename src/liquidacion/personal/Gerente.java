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
public class Gerente extends Empleado{
    private String area;

    public Gerente(Integer dni, String apellido, String nombre, Integer nroLegajo,String area) {
        super(dni, apellido, nombre, nroLegajo);
        this.area=area;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
}
