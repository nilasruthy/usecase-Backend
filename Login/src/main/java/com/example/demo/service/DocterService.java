package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Docter;

public interface DocterService {
    
    Docter saveDocter (Docter docter) ;
    List <Docter> getAlldocter();
    Docter getDocterById (Long id) ;
    Docter updateDocter (Docter docter, Long id);
    void deleteDocter (Long id);

}