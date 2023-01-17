package br.com.rodrigo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigo.demo.models.Frete;
import br.com.rodrigo.demo.service.FreteService;

@RestController
@RequestMapping("/frete")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @PostMapping
    public ResponseEntity<Frete> calcularFrete(@RequestBody Frete frete) {
        frete = freteService.calcularFrete(frete);
        return new ResponseEntity<>(frete, HttpStatus.OK);
    }
}