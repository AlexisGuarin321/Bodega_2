package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TipoPerfil;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-05-06T23:26:14")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Integer> idEstado;
    public static volatile SingularAttribute<Estado, String> estado;
    public static volatile ListAttribute<Estado, TipoPerfil> tipoPerfilList;

}