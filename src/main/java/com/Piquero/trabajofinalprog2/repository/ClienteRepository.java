package com.Piquero.trabajofinalprog2.repository;

import com.Piquero.trabajofinalprog2.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    

}
