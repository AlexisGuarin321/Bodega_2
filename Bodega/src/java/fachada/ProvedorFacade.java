/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Provedor;

/**
 *
 * @author alexis_guarin
 */
@Stateless
public class ProvedorFacade extends AbstractFacade<Provedor> {

    @PersistenceContext(unitName = "BodegaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProvedorFacade() {
        super(Provedor.class);
    }
    
}
