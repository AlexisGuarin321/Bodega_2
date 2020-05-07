package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Departamento;
import modelo.Personas;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, Departamento> idDepartamento;
    public static volatile SingularAttribute<Ciudad, String> ciudad;
    public static volatile ListAttribute<Ciudad, Personas> personasList;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudad;

}