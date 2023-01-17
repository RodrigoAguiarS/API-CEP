package br.com.rodrigo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigo.demo.models.Frete;

public interface FreteRepository extends JpaRepository<Frete, Long> {
    
}
