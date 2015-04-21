/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCVirtual
 */
public class Detalle {
    private Empleado emp;
    private Planilla pla;
    private double renta;
    private double bono;
    private double sueldoNeto;
    private List<Detalle> lstDetalle;

    public Detalle() {
        this.emp=new Empleado();
        this.pla = new Planilla();
        
        lstDetalle = new ArrayList();
    }

    public Detalle(Empleado emp, Planilla pla) {
        this.emp = emp;
        this.pla = pla;
        calcular();
    }
    private void calcular(){
        renta = emp.getSueldo() * 0.1;
        if(pla.getMes().equals("Diciembre")){
            bono = emp.getSueldo() * 0.3;
        } else {
            bono = 0;
        }
        sueldoNeto = emp.getSueldo() - renta + bono;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Planilla getPla() {
        return pla;
    }

    public void setPla(Planilla pla) {
        this.pla = pla;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public List<Detalle> getLstDetalle() {
        return lstDetalle;
    }

    public void setLstDetalle(List<Detalle> lstDetalle) {
        this.lstDetalle = lstDetalle;
    }
    
    
}
