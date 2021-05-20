package com.vi.in.spring5.repo;

import com.vi.in.spring5.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
