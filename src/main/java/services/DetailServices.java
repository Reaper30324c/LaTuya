package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IDetailRepository;

@Service
public class DetailServices {
    @Autowired
    IDetailRepository repository;
}
