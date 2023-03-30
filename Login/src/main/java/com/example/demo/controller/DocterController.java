package com.example.demo.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Docter;
import com.example.demo.service.DocterService;
@RestController
@RequestMapping ("/docter")
public class DocterController {
    
    private DocterService docterService ;
    public DocterController(DocterService docterService) {
        super();
        this.docterService = docterService;
    }
    
    // create rest api 
    
    @PostMapping ()
    public ResponseEntity<Docter> save(@RequestBody Docter docter) {
        
        return new ResponseEntity<Docter> (docterService.saveDocter(docter), HttpStatus.CREATED);
        
    }
    
    // get all api 
    
    @GetMapping
    public List<Docter> getAlldocter () {
        return docterService.getAlldocter();
    }
    
    // get by id 
    
    @GetMapping ("{id}")
    public ResponseEntity<Docter> getDocterById (@PathVariable ("id") Long id) {
        return new ResponseEntity<Docter> (docterService.getDocterById(id), HttpStatus.OK);
    }
    
    // update by id 
    
    @PutMapping ("{id}")
    public ResponseEntity<Docter> updateDocter(@PathVariable ("id") Long id , @RequestBody Docter docter) {
        return new ResponseEntity<Docter> (docterService.updateDocter(docter, id), HttpStatus.OK);
    }
    
    // delete api by id
    
        @DeleteMapping ("{id}")
        public ResponseEntity<String> deleteDocter(@PathVariable ("id") Long id) {
            docterService.deleteDocter(id);
            return new ResponseEntity <String> ("Docter info deleted" , HttpStatus.OK);
        }
}