package biblioteca.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "livros")
public class Biblioteca {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCliente;
    private String titulo;
    private String autor;
    private String genero;
    private Integer anoPublicacao;
    private Integer quantidadeDisponivel;
    private Boolean disponivel;


}
