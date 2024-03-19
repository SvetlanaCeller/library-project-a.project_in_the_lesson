package service;


import dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
}
