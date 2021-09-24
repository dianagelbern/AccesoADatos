package com.salesianostriana.ejercicio02;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monument")
@RequiredArgsConstructor
public class MonumentController {

    private final MonumentRepository repository;

    @GetMapping("/")
    public List<Monument> findAll(){
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Monument> create(@RequestBody Monument monument){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monument));
    }

    @GetMapping("/{id}")
    public Monument findOne(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Monument edit(@RequestBody Monument monument, @PathVariable Long id){
        Monument old = repository.findById(id).orElse(monument);
        old.setCodPais(monument.getCodPais());
        old.setNPais(monument.getNPais());
        old.setNCiudad(monument.getNCiudad());
        old.setLocalizacion(monument.getLocalizacion());
        old.setNombreMonumento(monument.getNombreMonumento());
        old.setDescripcion(monument.getDescripcion());
        old.setUrlFoto(monument.getUrlFoto());

        return repository.save(old);
    }

}
