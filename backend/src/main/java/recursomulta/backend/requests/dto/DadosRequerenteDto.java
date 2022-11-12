package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosRequerenteDto {
    @NotEmpty(message = "Nome do requerente deve ser preenchido")
    private String nome;
    @NotEmpty(message = "E-Mail do requerente deve ser preenchido")
    private String email;
    @NotEmpty(message = "Telefone do requerente deve ser preenchido")
    private String telefone;
    @NotEmpty(message = "Celular do requerente deve ser preenchido")
    private String celular;
    @NotNull(message = "Endereço do requerente deve ser preenchido")
    private EnderecoDto endereco;
    @NotNull(message = "Tipo de requerente deve ser selecionado")
    private TipoDoRequerenteDto tipoDoRequerente;

}
