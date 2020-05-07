package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Ciudad;
import modelo.Clasificacion;
import modelo.Provedor;
import modelo.Usuario;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Personas.class)
public class Personas_ { 

    public static volatile SingularAttribute<Personas, Integer> numDocumento;
    public static volatile ListAttribute<Personas, Usuario> usuarioList;
    public static volatile ListAttribute<Personas, Provedor> provedorList;
    public static volatile SingularAttribute<Personas, Date> fechaNacimiento;
    public static volatile SingularAttribute<Personas, String> apellido;
    public static volatile SingularAttribute<Personas, String> direccion;
    public static volatile SingularAttribute<Personas, Clasificacion> idClasificacion;
    public static volatile SingularAttribute<Personas, Double> telefono;
    public static volatile SingularAttribute<Personas, String> nombre;
    public static volatile SingularAttribute<Personas, Ciudad> idCiudad;
    public static volatile SingularAttribute<Personas, Integer> idPersona;
    public static volatile SingularAttribute<Personas, String> email;

}