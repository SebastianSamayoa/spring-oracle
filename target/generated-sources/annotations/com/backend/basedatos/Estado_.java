package com.backend.basedatos;

import com.backend.basedatos.Cliente;
import com.backend.basedatos.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Cliente> cliente;
    public static volatile SingularAttribute<Estado, String> estado;
    public static volatile ListAttribute<Estado, Factura> facturaList;
    public static volatile SingularAttribute<Estado, Long> idestado;

}