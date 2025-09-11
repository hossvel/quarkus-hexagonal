package com.hossvel.aplication.port.in;

import com.hossvel.aplication.dto.AuthorResponseDTO;
import com.hossvel.aplication.dto.RegisterAuthorDTO;

import java.util.List;

public interface IAuthorService {
    List<AuthorResponseDTO> getAllAuthors();
    AuthorResponseDTO registerAuthor(RegisterAuthorDTO dto);
}
