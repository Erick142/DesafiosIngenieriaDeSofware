package com.autos.api.repository;

import com.autos.api.model.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.stream.DoubleStream;

@Repository
public interface RepoAutos extends CrudRepository<Auto,Integer> {

    void guardar(Auto auto);


}