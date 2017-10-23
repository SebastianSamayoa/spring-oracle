package com.backend.basedatos;

import com.backend.basedatos.DetfacturaPK;
import com.backend.basedatos.Factura;
import com.backend.basedatos.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Detfactura.class)
public class Detfactura_ { 

    public static volatile SingularAttribute<Detfactura, BigDecimal> precio;
    public static volatile SingularAttribute<Detfactura, Factura> factura;
    public static volatile SingularAttribute<Detfactura, Produto> produto;
    public static volatile SingularAttribute<Detfactura, Long> cantidad;
    public static volatile SingularAttribute<Detfactura, DetfacturaPK> detfacturaPK;

}