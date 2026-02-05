package med.tera.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String numero;
    private String bairro;
    private String uf;
    private String pais;

    // Construtor que copia os campos de outro Endereco (nome do parâmetro alterado para 'dados')
    public Endereco(Endereco dados) {
        this.logradouro = dados.logradouro;
        this.cidade = dados.cidade;
        this.estado = dados.estado;
        this.cep = dados.cep;
        this.complemento = dados.complemento;
        this.numero = dados.numero;
        this.bairro = dados.bairro;
        this.uf = dados.uf;
        this.pais = dados.pais;
    }
}
