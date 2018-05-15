package com.example.Auth.service;

import java.util.List;

import com.example.Auth.model.Register;

public interface RegisterService {
   public List<Register> findAll();
    public Register saveRegister (Register register);
  public void updateRegister (Register register , long id);
   public Register findOne(long id);
  public void delete (long id);
}