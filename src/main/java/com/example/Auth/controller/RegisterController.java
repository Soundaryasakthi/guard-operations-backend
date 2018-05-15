package com.example.Auth.controller;

import java.util.List;

import com.example.Auth.model.Register;
import com.example.Auth.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin("*")

@RequestMapping("/reguser")
public class RegisterController {

    @Autowired 
    public RegisterService registerService;
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public ResponseEntity<?> saveRegister(@RequestBody Register register){
        System.out.println("++++++++++++++++save");
        registerService.saveRegister(register);
        return new ResponseEntity<Register>(register,HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method =RequestMethod.DELETE)
    public void deleteRegister(@PathVariable long id ){
        registerService.delete(id);
    }

    @RequestMapping(value="/getall",method = RequestMethod.GET)
    public List<Register> getregister() {
        System.out.println("+++++++++++++view");
        return registerService.findAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Register getRegister(@PathVariable long id) {
        System.out.println("+++++++++++++get");
        return registerService.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)

    public ResponseEntity<?> updateRegister(@RequestBody Register register, @PathVariable("id") long id) {
        Register r1 = register;
        registerService.updateRegister(r1, id);
        return new ResponseEntity<Register>(HttpStatus.OK);

    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Register event, UriComponentsBuilder ucBuilder) {
        Register event2 = event;
		System.out.println("++++++++++++"+event2);
        registerService.saveRegister(event2);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(event2.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

}