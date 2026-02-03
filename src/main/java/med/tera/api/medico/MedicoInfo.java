package med.tera.api.medico;

import med.tera.api.endereco.Endereco;

public record MedicoInfo(String nome, String telefone, String email, String crm, Especialidade especialidade, Endereco endereco) {

}
