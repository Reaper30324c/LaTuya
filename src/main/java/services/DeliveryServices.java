package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IDeliverymanRepository;

@Service
public class DeliveryServices {
    @Autowired
    IDeliverymanRepository repository;
}
