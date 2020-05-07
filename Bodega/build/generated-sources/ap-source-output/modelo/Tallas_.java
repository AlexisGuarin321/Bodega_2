package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Productosresibidos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Tallas.class)
public class Tallas_ { 

    public static volatile SingularAttribute<Tallas, String> tipo;
    public static volatile SingularAttribute<Tallas, Integer> idTalla;
    public static volatile ListAttribute<Tallas, Productosresibidos> productosresibidosList;

}