package com.hossvel.domain.service;

import com.hossvel.aplication.dto.AuthorResponseDTO;
import com.hossvel.aplication.dto.AuthorRequestDTO;
import com.hossvel.aplication.mapper.AuthorMapper;
import com.hossvel.aplication.port.in.IAuthorService;
import com.hossvel.aplication.port.out.persistence.IAuthorRepositoryPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AuthorServiceImpl implements IAuthorService {

    @Inject
    IAuthorRepositoryPort iAuthorRepositoryPort;

    @Override
    public List<AuthorResponseDTO> getAllAuthors() {

        return iAuthorRepositoryPort.getAllAuthors()
                .stream()
                .map(AuthorMapper::toAuthorResponseDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public AuthorResponseDTO registerAuthor(AuthorRequestDTO dto) {
        return AuthorMapper
                .toAuthorResponseDTO(iAuthorRepositoryPort.save(AuthorMapper.toAuthorEntity(dto)));

    }
}
