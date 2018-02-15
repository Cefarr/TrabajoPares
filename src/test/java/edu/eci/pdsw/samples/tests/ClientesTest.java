/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquilerItemsStub;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * 
 */
public class ClientesTest {

    public ClientesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
  
    @Test
    public void additems1() throws ExcepcionServiciosAlquiler{
    	
    }
    
    /**
     * /**
     * @obj registrar un cliente en el sistema
     * @param p el nuevo cliente
     * @pre p!=null
     * @pos el cliente queda disponible para futuros alquileres
     * @throws ExcepcionServiciosAlquiler si el cliente ya se encuentra registrado
     *
    public abstract void registrarCliente(Cliente p) throws ExcepcionServiciosAlquiler;
     *  Clases de equivalencia
     * El cliente no sea nulo, entonces se generara un nuevo cliente.
     * SI el cliente es nulo genera excepcion.
     * 
     * 
     */
    @Test
    public void regClientes()throws ExcepcionServiciosAlquiler{
        LinkedList<Cliente> lisPru= new LinkedList<>();
        ServiciosAlquilerItemsStub pru= new ServiciosAlquilerItemsStub();
        Cliente clie=new Cliente("Pepito", 1111111, "1111111", "Calle 1 # 1-1", "1@1mail.com");
        
        pru.registrarCliente(clie);
        lisPru=(LinkedList<Cliente>) pru.consultarClientes();
        
        assertTrue(lisPru.contains(clie));
        
     
    }
    
    
    
    
}
