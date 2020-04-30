package com.estudoudemy.cursomc.services;

import com.estudoudemy.cursomc.domain.Cliente;
import com.estudoudemy.cursomc.repositories.ClienteRepository;
import com.estudoudemy.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrato! Id: " + id + ", Tipo: " + Cliente.class.getName()));

    }
}
