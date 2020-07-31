package com.example.Hello.World.controller;
import com.example.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Hello.World.model.Item;
import org.springframework.http.HttpStatus;

@RestController
public class ItemController {

    @RequestMapping("/items")
    @ResponseBody
    public ResponseEntity<Item> getAllItems(){
        Item item = new Item("1", "Design Java", "Book");
        return new ResponseEntity<Item> (item, HttpStatus.OK);
    }
}