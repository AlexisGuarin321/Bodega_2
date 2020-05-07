package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Productoentregado;
import modelo.Productosresibidos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile ListAttribute<Tipoproducto, Productoentregado> productoentregadoList;
    public static volatile SingularAttribute<Tipoproducto, String> genero;
    public static volatile SingularAttribute<Tipoproducto, Integer> idTipoProducto;
    public static volatile ListAttribute<Tipoproducto, Productosresibidos> productosresibidosList;

}