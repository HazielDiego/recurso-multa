package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoDoRequerenteDto {
    @NotNull
    private Long id;
    @NotEmpty
    private String descricao;
}
