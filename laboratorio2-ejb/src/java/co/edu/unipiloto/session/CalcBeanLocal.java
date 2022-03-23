/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author juanc
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int a, int b);
    
    Integer resta(int a, int b);
    
    Double multiplicar(int a, int b);
    
    Double dividir(int a, int b);
    
    Double modulo(int a, int b);
    
    Double elevado(int a, int b);
    
    Double operacion(String operacion, int a, int b);
    
}
