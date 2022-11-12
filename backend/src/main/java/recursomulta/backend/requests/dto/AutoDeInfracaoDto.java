package recursomulta.backend.requests.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoDeInfracaoDto {
    @NotEmpty(message = "Número do auto de infração deve ser preenchido")
    private String numeroDoAutoDeInfracao;
    @NotEmpty(message = "Placa deve ser preenchida")
    private String placa;
    @NotEmpty(message = "Renavam deve ser preenchido")
    private String renavam;
    @NotEmpty(message = "Resumo da defesa deve ser preenchido")
    private String resumoDaDefesa;
}
