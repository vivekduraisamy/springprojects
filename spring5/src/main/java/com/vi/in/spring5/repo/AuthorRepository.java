package com.vi.in.spring5.repo;

import com.vi.in.spring5.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
