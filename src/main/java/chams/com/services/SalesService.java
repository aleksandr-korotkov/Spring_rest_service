package chams.com.services;

import chams.com.dao.SaleRepository;
import chams.com.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

    private SaleRepository saleRepository;

    @Autowired
    public void setSaleRepository(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Iterable<Sale> findAll() {
        return saleRepository.findAll();
    }

}