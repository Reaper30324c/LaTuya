package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IAddressRepository;

@Service
public class AddressService {
    @Autowired
    IAddressRepository repository;
}
