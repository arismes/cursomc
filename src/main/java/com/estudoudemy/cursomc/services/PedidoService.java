package com.estudoudemy.cursomc.services;

import com.estudoudemy.cursomc.domain.Pedido;
import com.estudoudemy.cursomc.repositories.PedidoRepository;
import com.estudoudemy.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrato! Id: " + id + ", Tipo: " + Pedido.class.getName()));

    }
}
