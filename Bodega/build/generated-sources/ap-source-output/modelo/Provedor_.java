package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Personas;
import modelo.Productosresibidos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Provedor.class)
public class Provedor_ { 

    public static volatile SingularAttribute<Provedor, Integer> idProvedor;
    public static volatile SingularAttribute<Provedor, Integer> nit;
    public static volatile SingularAttribute<Provedor, Personas> idPersona;
    public static volatile ListAttribute<Provedor, Productosresibidos> productosresibidosList;

}