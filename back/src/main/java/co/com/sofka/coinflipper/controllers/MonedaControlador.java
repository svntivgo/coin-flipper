package co.com.sofka.coinflipper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import co.com.sofka.coinflipper.models.Moneda;
import co.com.sofka.coinflipper.services.MonedaService;
import reactor.core.publisher.Mono;

@Controller
public class MonedaControlador {
  @Autowired
  MonedaService monedaService;

  @PostMapping("/girar-moneda")
  public Mono<Moneda> girarMoneda () {
    return monedaService.girarMoneda();
  }
}
