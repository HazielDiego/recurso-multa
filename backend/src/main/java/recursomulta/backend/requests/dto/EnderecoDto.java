package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
    @NotEmpty(message = "CEP do endereço do requerente deve ser preenchido")
    private String cep;
    @NotEmpty(message = "Cidade do endereço do requerente deve ser preenchido")
    private String cidade;
    @NotEmpty(message = "Logradouro do endereço do requerente deve ser preenchido")
    private String logradouro;
    @NotEmpty(message = "Número do endereço do requerente deve ser preenchido")
    private String numero;
    private String complemento;
    @NotNull(message = "Estado do endereço do requerente deve ser selecionado")
    private UnidadeFederativaDto estado;
}
