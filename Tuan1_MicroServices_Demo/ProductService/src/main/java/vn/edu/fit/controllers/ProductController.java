package vn.edu.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.fit.models.Product;
import vn.edu.fit.repositories.ProductRepository;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    
}
