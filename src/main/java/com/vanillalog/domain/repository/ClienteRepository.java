package com.vanillalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanillalog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome); //o Spring Data JPA vai fornecer um impelmentação de pesquisa por nome em tempo de execução
	List<Cliente> findByNomeContaining(String nome);
	Optional<Cliente> findByEmail(String email);
}
