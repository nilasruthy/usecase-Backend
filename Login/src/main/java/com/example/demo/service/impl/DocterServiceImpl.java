package com.example.demo.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Docter;
import com.example.demo.repository.DocterRepository;
import com.example.demo.service.DocterService;
@Service
public class DocterServiceImpl implements DocterService{
    
    private DocterRepository docterRepository ;
    
    
    public DocterServiceImpl(DocterRepository docterRepository) {
        super();
        this.docterRepository = docterRepository;
    }
    @Override
    public Docter saveDocter(Docter docter) {
        return docterRepository.save(docter);
    }
    @Override
    public List<Docter> getAlldocter() {
        return docterRepository.findAll();
    }
    @Override
    public Docter getDocterById(Long id) {
        
        Optional<Docter> docter = docterRepository.findById(id);
        if (docter.isPresent()) {
            return docter.get();
        } else {
            throw new ResourceNotFoundException ("Docter" , "Id" , id);
        }
    }
    @Override
    public Docter updateDocter(Docter docter, Long id) {
        Docter existingDocter = docterRepository.findById(id).orElseThrow (
                () -> new ResourceNotFoundException ("Docter", "Id" , id));
        
        existingDocter.setName(docter.getName());
        existingDocter.setSpecialist(docter.getSpecialist());
        existingDocter.setEmail(docter.getEmail());
        existingDocter.setNumber(docter.getNumber());
        existingDocter.setPassword(docter.getPassword());
        
        docterRepository.save(existingDocter);
        return existingDocter;
    }
    @Override
    public void deleteDocter(Long id) {
        docterRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Docter" , "Id" , id));
        docterRepository.deleteById(id);
        
    }
    
    
}