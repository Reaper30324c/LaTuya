package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IProductRepository;

@Service
public class PeoductRepository {

    @Autowired
    IProductRepository repository;
}
