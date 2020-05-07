package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;
import modelo.Tipoproducto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Productoentregado.class)
public class Productoentregado_ { 

    public static volatile SingularAttribute<Productoentregado, Integer> idProductoEntregado;
    public static volatile SingularAttribute<Productoentregado, String> ref;
    public static volatile SingularAttribute<Productoentregado, Float> iva;
    public static volatile SingularAttribute<Productoentregado, Integer> valorSubtotal;
    public static volatile SingularAttribute<Productoentregado, Integer> valorTotal;
    public static volatile SingularAttribute<Productoentregado, Date> fechaEntrega;
    public static volatile SingularAttribute<Productoentregado, Integer> cantidad;
    public static volatile SingularAttribute<Productoentregado, Producto> idProducto;
    public static volatile SingularAttribute<Productoentregado, Tipoproducto> idTipoProducto;

}