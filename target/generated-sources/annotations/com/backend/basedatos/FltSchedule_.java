package com.backend.basedatos;

import com.backend.basedatos.Airport;
import com.backend.basedatos.FltInstance;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(FltSchedule.class)
public class FltSchedule_ { 

    public static volatile SingularAttribute<FltSchedule, Airport> fromAirportcode;
    public static volatile SingularAttribute<FltSchedule, Date> atime;
    public static volatile SingularAttribute<FltSchedule, Date> dtime;
    public static volatile SingularAttribute<FltSchedule, String> airline;
    public static volatile ListAttribute<FltSchedule, FltInstance> fltInstanceList;
    public static volatile SingularAttribute<FltSchedule, Airport> toAirportcode;
    public static volatile SingularAttribute<FltSchedule, Short> flt;

}