package com.backend.basedatos;

import com.backend.basedatos.FltInstancePK;
import com.backend.basedatos.FltSchedule;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(FltInstance.class)
public class FltInstance_ { 

    public static volatile SingularAttribute<FltInstance, FltInstancePK> fltInstancePK;
    public static volatile SingularAttribute<FltInstance, BigInteger> availSeats;
    public static volatile SingularAttribute<FltInstance, FltSchedule> fltSchedule;

}