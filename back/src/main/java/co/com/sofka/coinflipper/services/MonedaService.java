package co.com.sofka.coinflipper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.coinflipper.models.Moneda;
import co.com.sofka.coinflipper.repositories.MonedaRepository;
import reactor.core.publisher.Mono;

@Service
public class MonedaService {
  @Autowired
  MonedaRepository monedaRepo;

  public Mono<Moneda> girarMoneda () {
    Moneda moneda = new Moneda();
    return monedaRepo.save(moneda);
  }
}
