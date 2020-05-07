package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;
import modelo.Provedor;
import modelo.Tallas;
import modelo.Tipoproducto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Productosresibidos.class)
public class Productosresibidos_ { 

    public static volatile SingularAttribute<Productosresibidos, Provedor> idProvedor;
    public static volatile SingularAttribute<Productosresibidos, String> ref;
    public static volatile SingularAttribute<Productosresibidos, Integer> idProductoResibido;
    public static volatile SingularAttribute<Productosresibidos, Date> fechaResivido;
    public static volatile SingularAttribute<Productosresibidos, Integer> valorTotal;
    public static volatile SingularAttribute<Productosresibidos, Tallas> idTalla;
    public static volatile SingularAttribute<Productosresibidos, Integer> valorUnidad;
    public static volatile SingularAttribute<Productosresibidos, Integer> cantidad;
    public static volatile SingularAttribute<Productosresibidos, Producto> idProducto;
    public static volatile SingularAttribute<Productosresibidos, Tipoproducto> idTipoProducto;

}