package br.com.pedrodev.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
public class CreateJobDTO {
    
    @Schema(example = "Vaga para pessoa desenvolvedora júnior", requiredMode = RequiredMode.REQUIRED)
    private String description;

    @Schema(example = "JÚNIOR", requiredMode = RequiredMode.REQUIRED)
    private String level;

    @Schema(example = "GYMPass, Plano de saude", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
}
