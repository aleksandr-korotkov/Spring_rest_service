package chams.com.controllers;

import chams.com.entities.Sale;
import chams.com.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sales")
public class SaleRestController {

    private SalesService salesService;

    @Autowired
    public void setSalesService(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Sale>> getAll() {
        return ResponseEntity.ok().body(salesService.findAll());
    }
}