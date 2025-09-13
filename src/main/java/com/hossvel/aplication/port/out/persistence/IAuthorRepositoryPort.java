package com.hossvel.aplication.port.out.persistence;

import com.hossvel.domain.model.Author;

import java.util.List;

public interface IAuthorRepositoryPort {

    Author save(Author author);
    List<Author> getAllAuthors();

}
