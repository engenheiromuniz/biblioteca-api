package com.muniz.biblioteca_api.dto;

import com.muniz.biblioteca_api.model.StatusLeitura;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LivroRequestDTO(
    @NotBlank(message = "O título é obrigatório")
    String titulo,

    @NotBlank(message = "O autor é obrigatório")
    String autor,

    Integer anoPublicacao,

    @NotNull(message = "O status de leitura é obrigatório")
    StatusLeitura status,

    @NotNull(message = "A categoria é obrigatória")
    Long categoriaId
) {}