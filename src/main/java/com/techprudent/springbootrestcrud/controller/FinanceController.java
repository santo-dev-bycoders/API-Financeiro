package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Finance;
import com.techprudent.springbootrestcrud.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  long id) {
        return new ResponseEntity<>(financeService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@RequestBody List<Finance> listFinance) {
        return new ResponseEntity<>(financeService.create(listFinance), HttpStatus.OK);
    }

    @RequestMapping(value ="/findAll", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findAll() {
        return new ResponseEntity<>(financeService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value ="/countValue", method = RequestMethod.GET)
    public int countValue() {
        return financeService.countValue();
    }

    @RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        financeService.delete(id);

    }

    @RequestMapping(value = "/saveFinance", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> save(@RequestBody Finance finance) {
        return new ResponseEntity<>(financeService.saveFinance(finance), HttpStatus.OK);
    }
}
