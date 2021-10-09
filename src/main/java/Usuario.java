import lombok.Data;

import java.time.LocalDate;

@Data
public class Usuario {
    private String nome;
    private String cpf;

    @IdadeMinima(valor=18)
    private LocalDate dataNascimento;

    public Usuario(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
