package com.lnjs.agriculture.controller;

import com.lnjs.agriculture.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/demo")
    public String myDemo(){

        return "demo";
    }

    @RequestMapping("/echarts")
    public String myECharts(Model model){

        String skirt = "裙子";
        int nums = 30;

        model.addAttribute("skirt", skirt);
        model.addAttribute("nums", nums);

        return "echarts";
    }

    @RequestMapping("/project")
    @ResponseBody
    public List<Product> myProject(){

        ArrayList<Product> productArrayList = new ArrayList<Product>();
        Product product1 = new Product();
        product1.setProductName("袜子");
        product1.setNums(15);
        Product product2 = new Product();
        product2.setProductName("羊毛衫");
        product2.setNums(20);
        Product product3 = new Product();
        product3.setProductName("雪纺衫");
        product3.setNums(24);
        Product product4 = new Product();
        product4.setProductName("高跟鞋");
        product4.setNums(130);

        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);

        return productArrayList;
    }

    @RequestMapping("/view")
    public String myView(){
        return "view";
    }

    @RequestMapping("/test")
    public String myTest(){
        return "test";
    }
}
