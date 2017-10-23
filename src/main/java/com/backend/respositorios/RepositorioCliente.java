package com.backend.respositorios;

import com.backend.basedatos.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 *
 * @author jhoan
 */
public interface RepositorioCliente extends PagingAndSortingRepository<Cliente, Integer> , QueryByExampleExecutor<Cliente>{
    
}
