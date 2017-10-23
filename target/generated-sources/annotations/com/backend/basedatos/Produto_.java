package com.backend.basedatos;

import com.backend.basedatos.Claseproducto;
import com.backend.basedatos.Detfactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile ListAttribute<Produto, Detfactura> detfacturaList;
    public static volatile SingularAttribute<Produto, Long> precio;
    public static volatile SingularAttribute<Produto, Long> existecia;
    public static volatile SingularAttribute<Produto, Claseproducto> idclaseprod;
    public static volatile SingularAttribute<Produto, String> producto;
    public static volatile SingularAttribute<Produto, Long> idproducto;

}