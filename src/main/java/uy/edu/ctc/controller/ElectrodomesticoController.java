package uy.edu.ctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.edu.ctc.entity.Electrodomestico;
import uy.edu.ctc.entity.ElectrodomesticoLineaBlanca;
import uy.edu.ctc.entity.ElectrodomesticoUsoPersonal;
import uy.edu.ctc.service.ElectrodomesticoLineaBlancaService;
import uy.edu.ctc.service.ElectrodomesticoService;
import uy.edu.ctc.service.ElectrodomesticoUsoPersonalService;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class ElectrodomesticoController {


    @Autowired
    private ElectrodomesticoLineaBlancaService electrodomesticoLineaBlancaService;

    @Autowired
    private ElectrodomesticoUsoPersonalService electrodomesticoUsoPersonalService;


    @PostMapping(value = "/lineablanca/save")
    public ResponseEntity<?> createLineablanca(@RequestBody ElectrodomesticoLineaBlanca elec) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(electrodomesticoLineaBlancaService.save(elec));
        } catch (Exception e) {
            HashMap<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }

    }
    @GetMapping(value = "/lineablanca/list")
    public List<Electrodomestico> readAllLineaBlanca() {
        List<Electrodomestico> elec = StreamSupport
                .stream(electrodomesticoLineaBlancaService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return elec;
    }
    @PostMapping(value = "/lineablanca/delete/{id}")
    public ResponseEntity<?> deleteLineaBlanca(@PathVariable Long id) {
        electrodomesticoLineaBlancaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);

    }
    @PostMapping(value = "/usopersonal/save")
    public ResponseEntity<?> createUsoPersonal(@RequestBody ElectrodomesticoUsoPersonal elec) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(electrodomesticoUsoPersonalService.save(elec));
        } catch (Exception e) {
            HashMap<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }

    }
    @GetMapping(value = "/usopersonal/list")
    public List<Electrodomestico> readAllUsoPersonal() {
        List<Electrodomestico> elec = StreamSupport
                .stream(electrodomesticoUsoPersonalService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return elec;
    }
    @PostMapping(value = "/usopersonal/delete/{id}")
    public ResponseEntity<?> deleteUsoPersonal(@PathVariable Long id) {
        electrodomesticoUsoPersonalService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);

    }
}

