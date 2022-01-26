package com.br.generation.BackEnd.Farmacia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.generation.BackEnd.Farmacia.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public Categoria findByFornecedorContainingIgnoreCase(String Fornecedor);
}
