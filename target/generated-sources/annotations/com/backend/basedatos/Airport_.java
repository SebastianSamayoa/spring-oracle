package com.backend.basedatos;

import com.backend.basedatos.FltSchedule;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Airport.class)
public class Airport_ { 

    public static volatile ListAttribute<Airport, FltSchedule> fltScheduleList1;
    public static volatile SingularAttribute<Airport, String> city;
    public static volatile SingularAttribute<Airport, String> name;
    public static volatile SingularAttribute<Airport, String> airportcode;
    public static volatile ListAttribute<Airport, FltSchedule> fltScheduleList;
    public static volatile SingularAttribute<Airport, String> state;

}