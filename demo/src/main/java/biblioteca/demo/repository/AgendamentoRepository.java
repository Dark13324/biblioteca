package biblioteca.demo.repository;

import biblioteca.demo.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgendamentoRepository extends JpaRepository<Biblioteca, Long> {

    List<Biblioteca> findByquantidadeDisponivelGreaterThan(Integer quantidadeDisponivel);
    Optional<Biblioteca> findBytituloContainingIgnoreCase(String titulo);

}
