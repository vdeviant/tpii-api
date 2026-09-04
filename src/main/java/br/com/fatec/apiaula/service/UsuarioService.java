package br.com.fatec.apiaula.service;

import br.com.fatec.apiaula.model.Usuario;
import br.com.fatec.apiaula.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository
                                  usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> buscarPorId(Integer id) {
        return usuarioRepository.findById(id);
    }
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> atualizar(Integer id, Usuario usuarioAtualizado) {
        return usuarioRepository.findById(id).map(usuarioExistente -> {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setIdade(usuarioAtualizado.getIdade());
            return usuarioRepository.save(usuarioExistente);
        });
    }

}

