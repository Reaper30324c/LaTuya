package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IStoreRepository;

@Service
public class StoreService {

    @Autowired
    IStoreRepository repository;
}
