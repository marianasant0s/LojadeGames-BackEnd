package org.generation.lojadegames.Repository;

import java.util.List;

import org.generation.lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByNomeContainingIgnoreCase( String nome);
}