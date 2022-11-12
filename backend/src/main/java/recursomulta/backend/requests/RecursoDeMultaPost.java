package recursomulta.backend.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import recursomulta.backend.requests.dto.AutoDeInfracaoDto;
import recursomulta.backend.requests.dto.DadosRequerenteDto;
import recursomulta.backend.requests.dto.DeclaracaoDto;
import recursomulta.backend.requests.dto.TipoDeDefesaDto;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecursoDeMultaPost {

    private Timestamp createdAt;
    @NotNull(message = "Declaração deve ser selecionada")
    private DeclaracaoDto declaracao;
    @NotNull(message = "Tipo de defesa deve ser preenchida")
    private TipoDeDefesaDto tipoDeDefesa;
    @NotNull(message = "Auto de Infração deve ser preenchido")
    private AutoDeInfracaoDto autoDeInfracao;
    @NotNull(message = "Dados do requerente devem ser preenchidos")
    private DadosRequerenteDto dadosRequerente;
}
