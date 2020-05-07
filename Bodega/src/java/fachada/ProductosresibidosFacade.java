/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Productosresibidos;

/**
 *
 * @author alexis_guarin
 */
@Stateless
public class ProductosresibidosFacade extends AbstractFacade<Productosresibidos> {

    @PersistenceContext(unitName = "BodegaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductosresibidosFacade() {
        super(Productosresibidos.class);
    }
    
}
