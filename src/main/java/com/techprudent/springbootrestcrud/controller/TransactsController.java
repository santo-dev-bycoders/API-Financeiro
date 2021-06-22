package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Transacts;
import com.techprudent.springbootrestcrud.service.TransactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacts")
public class TransactsController {

    @Autowired
    private TransactsService transactervice;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  long id) {
        return new ResponseEntity<>(transactervice.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@RequestBody Transacts transacts) {
        return new ResponseEntity<>(transactervice.create(transacts), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public @ResponseBody ResponseEntity<?> update(@RequestBody Transacts transacts) {
        return new ResponseEntity<>(transactervice.update(transacts), HttpStatus.OK);
    }

    @RequestMapping(value ="/findAll", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findAll() {
        return new ResponseEntity<>(transactervice.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        transactervice.delete(id);
    }
}
