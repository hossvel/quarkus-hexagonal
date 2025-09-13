package com.hossvel.aplication.mapper;

import com.hossvel.aplication.dto.AuthorRequestDTO;
import com.hossvel.aplication.dto.AuthorResponseDTO;
import com.hossvel.domain.model.Author;

public class AuthorMapper {

    public static Author toAuthorEntity(AuthorRequestDTO dto) {
        Author author = new Author();
        author.setFirstName(dto.firstName) ;
        author.setBirthdate(dto.birthdate);
        return author;
    }

    public static AuthorResponseDTO toAuthorResponseDTO(Author entity) {
        AuthorResponseDTO dto = new AuthorResponseDTO();
        dto.firstName = entity.getFirstName();
        dto.birthdate = entity.getBirthdate();
        dto.authorId = entity.id;
        return dto;
    }
}
