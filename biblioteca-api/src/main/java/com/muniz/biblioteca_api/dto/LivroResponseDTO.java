package com.muniz.biblioteca_api.dto;

import com.muniz.biblioteca_api.model.StatusLeitura;

public record LivroResponseDTO(
    Long id,
    String titulo,
    String autor,
    Integer anoPublicacao,
    StatusLeitura status,
    CategoriaResponseDTO categoria
) {}