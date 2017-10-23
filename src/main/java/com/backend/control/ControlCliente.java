package com.backend.control;

import com.backend.basedatos.Cliente;
import com.backend.respositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhoan
 */
@RestController
@Service
@EnableJpaRepositories(basePackages ="respositorios")
public class ControlCliente {

    @Autowired
    RepositorioCliente rc;
    
    @RequestMapping(
            value ="cliente/all",
            method = RequestMethod.GET,
            produces = "application/json")
    public List<Cliente> getAll(){
        List<Cliente> result = (List<Cliente>) rc.findAll();
        return result;
    }
    
}
