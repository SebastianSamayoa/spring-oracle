package com.backend.basedatos;

import com.backend.basedatos.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T22:41:31")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> segundoNombre;
    public static volatile SingularAttribute<Persona, Persona> idpersonaPadre;
    public static volatile SingularAttribute<Persona, String> primerNombre;
    public static volatile SingularAttribute<Persona, String> primerApellido;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, Long> cui;
    public static volatile ListAttribute<Persona, Persona> personaList;
    public static volatile SingularAttribute<Persona, Long> idpersona;
    public static volatile SingularAttribute<Persona, String> segundoApellido;

}