package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Ciudad;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile ListAttribute<Departamento, Ciudad> ciudadList;
    public static volatile SingularAttribute<Departamento, String> nombre;

}