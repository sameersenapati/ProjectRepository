package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Product;
import in.nit.repo.ProductRepository;
import in.nit.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository repo;
	public List<Product> getAllProducts() {
		List<Product> list=repo.findAll();
		return list;
	}

}
