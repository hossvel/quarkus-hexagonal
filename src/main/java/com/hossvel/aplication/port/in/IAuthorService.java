package com.hossvel.aplication.port.in;

import com.hossvel.aplication.dto.AuthorResponseDTO;
import com.hossvel.aplication.dto.AuthorRequestDTO;

import java.util.List;

public interface IAuthorService {
    List<AuthorResponseDTO> getAllAuthors();
    AuthorResponseDTO registerAuthor(AuthorRequestDTO dto);
}
