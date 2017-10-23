package com.backend.basedatos;

import com.backend.basedatos.Cliente;
import com.backend.basedatos.Detfactura;
import com.backend.basedatos.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile ListAttribute<Factura, Detfactura> detfacturaList;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Long> idfactura;
    public static volatile SingularAttribute<Factura, Estado> idestado;

}