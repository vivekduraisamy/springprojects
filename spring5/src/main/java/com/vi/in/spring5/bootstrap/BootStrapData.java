package com.vi.in.spring5.bootstrap;

import com.vi.in.spring5.domain.Author;
import com.vi.in.spring5.domain.Book;
import com.vi.in.spring5.domain.Publisher;
import com.vi.in.spring5.repo.AuthorRepository;
import com.vi.in.spring5.repo.BookRepository;
import com.vi.in.spring5.repo.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting BootStrapData....");
        Author vivek = new Author("Vivek", "Duraisamy");
        Book myd = new Book("My Distraction", "12345");
        Publisher abc = new Publisher();
        abc.setName("ABC Publishing");
        abc.setAddressLine1("2nd cross street");
        abc.setCity("Chennai");
        abc.setState("Tamil Nadu");
        abc.setZip("600028");
        myd.getAuthors().add(vivek);
        vivek.getBooks().add(myd);
        abc.getBooks().add(myd);
        authorRepository.save(vivek);
        bookRepository.save(myd);
        publisherRepository.save(abc);
        System.out.println("Authors count: "+authorRepository.count());
        System.out.println("Books count: "+bookRepository.count());
        System.out.println("Publisher count: "+publisherRepository.count());

    }
}
