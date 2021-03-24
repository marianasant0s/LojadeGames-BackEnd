package org.generation.lojadegames.Repository;

import java.util.List;

import org.generation.lojadegames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nome);
}
