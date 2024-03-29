package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ProducttestController {
    @Autowired
    private ProducttestService service;
    @GetMapping("/")
    public String getAllProducts(Model model){
        List<ProductTest> productTestList = service.getAllProducts();
        model.addAttribute("productTestList",productTestList);
        return "product-list";
    }

    @GetMapping("/add-product")
    public String addProductform(){
        return "add-product";
    }

    @RequestMapping (value= "/add-product", method= RequestMethod.POST)
    public String addProduct(@RequestParam("name") String name, @RequestParam("price")String price)
    {
        service.addProduct(name,price);
        return "redirect:/";
    }
}
