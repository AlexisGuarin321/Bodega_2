package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Personas;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Clasificacion.class)
public class Clasificacion_ { 

    public static volatile ListAttribute<Clasificacion, Personas> personasList;
    public static volatile SingularAttribute<Clasificacion, Integer> nit;
    public static volatile SingularAttribute<Clasificacion, Integer> idClasificacion;
    public static volatile SingularAttribute<Clasificacion, String> rol;

}