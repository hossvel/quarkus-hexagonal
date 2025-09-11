package com.hossvel.domain.service;

import com.hossvel.aplication.dto.AuthorResponseDTO;
import com.hossvel.aplication.dto.RegisterAuthorDTO;
import com.hossvel.aplication.port.in.IAuthorService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class AuthorServiceImpl implements IAuthorService {


    @Override
    public List<AuthorResponseDTO> getAllAuthors() {
        AuthorResponseDTO authorResponseDTO = new AuthorResponseDTO();
        authorResponseDTO.authorId = 20L;
        authorResponseDTO.birthdate = "1990-01-01";
        authorResponseDTO.firstName = "Hoss";


        return List.of(authorResponseDTO);
    }

    @Override
    public AuthorResponseDTO registerAuthor(RegisterAuthorDTO dto) {
        AuthorResponseDTO authorResponseDTO = new AuthorResponseDTO();
        authorResponseDTO.authorId = 10L;
        authorResponseDTO.birthdate = dto.birthdate;
        authorResponseDTO.firstName = dto.firstName;

        return authorResponseDTO;
    }
}
