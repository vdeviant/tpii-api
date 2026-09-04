package br.com.fatec.apiaula.repository;

import br.com.fatec.apiaula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
