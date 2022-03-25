package co.com.sofka.coinflipper.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import co.com.sofka.coinflipper.models.Moneda;

@Repository
public interface MonedaRepository extends ReactiveMongoRepository<Moneda, String> {
}
