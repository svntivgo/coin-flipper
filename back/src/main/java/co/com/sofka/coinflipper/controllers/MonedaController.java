package co.com.sofka.coinflipper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.coinflipper.services.MonedaService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/app")
public class MonedaController {
  @Autowired
  MonedaService monedaService;

  @PostMapping("/girar-moneda")
  @ResponseStatus(HttpStatus.OK)
  public Boolean girarMoneda () {
    return monedaService.girarMoneda();
  }
}
