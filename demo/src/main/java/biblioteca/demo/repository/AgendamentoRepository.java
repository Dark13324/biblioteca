package biblioteca.demo.repository;

import biblioteca.demo.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Biblioteca, Long> {
}
