package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.model.Product;
import in.nit.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService service;
     @RequestMapping("/all")
     public String showProducts(Model model) {
    	 List<Product> list = service.getAllProducts();
    	 model.addAttribute("list",list);
    	 return "ProductsData";
     }
	
}
