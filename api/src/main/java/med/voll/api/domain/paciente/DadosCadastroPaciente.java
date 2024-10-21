package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPaciente(
        @NotBlank String nome,
        @NotBlank String email,
        @NotBlank String telefone,
        @NotBlank String cpf)
{

}
