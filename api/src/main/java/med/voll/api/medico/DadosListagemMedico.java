package med.voll.api.medico;

public record DadosListagemMedico(Long id, String nome, String email, String crf, Especialidade especialidade) {

    public DadosListagemMedico (Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade());
    }
}
