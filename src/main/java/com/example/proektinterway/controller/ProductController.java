package com.example.proektinterway.controller;

import com.example.proektinterway.exception.ProductNotFoundException;
import com.example.proektinterway.model.Product;
import com.example.proektinterway.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
    return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException(id));
    }
    @PostMapping()
    public Product create(@RequestBody Product product){
        return  productRepository.save(product);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,@RequestBody Product product){
        product.setId(id);
        return productRepository.save(product);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productRepository.deleteById(id);
    }

}
