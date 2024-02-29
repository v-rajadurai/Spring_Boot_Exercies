package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Product;
import com.example.springapp.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public boolean saveProduct(Product product)
    {
        try{
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;

        }
    }
    public List<Product> listPagination(int offset,int pagesize)
    {
        return productRepo.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    public List<Product> listPaginationfield(String field)
    {
        return productRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<Product> listPaginationSort(int offset,int pagesize,String field)
    {
        PageRequest pageRequest=PageRequest.of(offset, pagesize, Sort.Direction.ASC,field);
        List<Product> a=productRepo.findAll(pageRequest).getContent();
        return a;
    }

}
