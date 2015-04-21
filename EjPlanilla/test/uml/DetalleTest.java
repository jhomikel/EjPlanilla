/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uml;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author PCVirtual
 */
public class DetalleTest {
    
    
    public DetalleTest() {
        
        
    }

    @Test
    public void testSomeMethod() {
        Detalle det = new Detalle();
        det.getEmp().setCarnet(1);
        det.getEmp().setNombre("Jhony");
        det.getEmp().setSueldo(500.00);
        det.getPla().setId(42015);
        det.getPla().setMes("Abril");
        det.getLstDetalle().add(new Detalle(det.getEmp(), det.getPla()));
        for (Detalle iterar : det.getLstDetalle()) {
            System.out.println("Nombre: " + det.getEmp().getNombre());
        }
        
    }
    
}
