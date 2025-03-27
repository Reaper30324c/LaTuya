package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IRequestRepository;

@Service
public class RequestService {

    @Autowired
    IRequestRepository repository;
}
