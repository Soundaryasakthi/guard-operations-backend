package com.example.Auth.service;

import java.util.List;

import com.example.Auth.Repository.RegisterRepository;
import com.example.Auth.model.Register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImp implements RegisterService{

    @Autowired 
    private RegisterRepository registerrepository;

    @Override
    public List<Register> findAll(){
        System.out.println("||||||||||||find");
        return registerrepository.findAll();
    }
    @Override
    public Register saveRegister(Register register){
        System.out.println("||||||||||||saveser");
        return registerrepository.saveAndFlush(register);
    }
    @Override
    public void updateRegister(Register register , long id){
        register.setId(id);
        registerrepository.saveAndFlush(register);
       
    }

    @Override
    public Register findOne(long id){
        return registerrepository.findOne(id);
    }

	@Override
	public void delete(long id) {
       registerrepository.delete(id);
        
	}
}