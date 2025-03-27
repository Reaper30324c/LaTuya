package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IPaymentRepository;

@Service

public class PaymentService {
    @Autowired
    IPaymentRepository repository;
}
