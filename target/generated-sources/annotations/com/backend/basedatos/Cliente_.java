package com.backend.basedatos;

import com.backend.basedatos.Estado;
import com.backend.basedatos.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Estado> estado;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> nit;
    public static volatile ListAttribute<Cliente, Factura> facturaList;
    public static volatile SingularAttribute<Cliente, Long> idcliente;
    public static volatile SingularAttribute<Cliente, String> nombrecliente;
    public static volatile SingularAttribute<Cliente, String> apellidocliente;
    public static volatile SingularAttribute<Cliente, Integer> idestado;

}