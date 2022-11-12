package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeclaracaoDto {
    @NotEmpty
    private String texto;
    @NotEmpty(message = "É necessário aceitar a declaração")
    private String aceitou;
}
