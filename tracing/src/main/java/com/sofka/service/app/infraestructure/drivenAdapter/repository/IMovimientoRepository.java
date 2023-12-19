package com.sofka.service.app.infraestructure.drivenAdapter.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sofka.service.app.infraestructure.drivenAdapter.entity.Movimiento;

public interface IMovimientoRepository extends ReactiveMongoRepository<Movimiento, String> {

}
