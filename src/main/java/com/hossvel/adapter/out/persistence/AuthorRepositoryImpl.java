package com.hossvel.adapter.out.persistence;

import com.hossvel.aplication.port.out.persistence.IAuthorRepositoryPort;
import com.hossvel.domain.model.Author;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class AuthorRepositoryImpl  implements PanacheRepositoryBase<Author, Long>, IAuthorRepositoryPort{

    @Override
    public Author save(Author author) {
        persist(author);
        return author;
    }

    @Override
    public List<Author> getAllAuthors() {
        return listAll();
    }

}
