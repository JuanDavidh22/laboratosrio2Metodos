/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author juanc
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    //Restar, multiplicar, dividir, módulo y elevar al cuadrado.
    @Override
    public Integer suma(int a, int b) {
        return a + b;
    }

    @Override
    public Double operacion(String operacion, int a, int b) {
        if (operacion.equals("Sumar")) {
            return Double.valueOf(suma(a, b));
        } else if (operacion.equals("Restar")) {
            return Double.valueOf(resta(a, b));
        } else if (operacion.equals("Dividir")) {
            return dividir(a, b);
        } else if (operacion.equals("Multiplicar")) {
            return multiplicar(a, b);
        } else if (operacion.equals("Modulo")) {
            return modulo(a, b);
        } else {
            return elevado(a, b);
        }
    }

    @Override
    public Integer resta(int a, int b) {
        return a - b;
    }

    @Override
    public Double dividir(int a, int b) {
        return Double.valueOf(a / b);
    }

    @Override
    public Double multiplicar(int a, int b) {
        return Double.valueOf(a * b);
    }

    @Override
    public Double modulo(int a, int b) {
        return Double.valueOf(Math.floorMod(a, b));
    }

    @Override
    public Double elevado(int a, int b) {
        return Math.pow(a, b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
