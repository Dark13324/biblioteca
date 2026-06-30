package biblioteca.demo.service;


import biblioteca.demo.model.Biblioteca;
import biblioteca.demo.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LivroAgendamento {

    @Autowired
    private final AgendamentoRepository agendamentoRepository;

    public List<Biblioteca> consultarBiblioteca() {
        return agendamentoRepository.findByquantidadeDisponivelGreaterThan(0);

    }

    public Biblioteca pesquisarLivro(String titulo) {
        return agendamentoRepository.findBytituloContainingIgnoreCase(titulo)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }


}