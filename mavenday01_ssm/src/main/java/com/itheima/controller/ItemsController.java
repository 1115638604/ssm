package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itmes")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showDetail")
    public String testItems(Model model) {
        Items items = itemsService.findById(2);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
