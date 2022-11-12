package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadeFederativaDto {
    @NotNull
    private Long id;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String sigla;
}
