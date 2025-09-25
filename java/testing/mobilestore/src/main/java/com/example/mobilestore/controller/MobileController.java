package com.example.mobilestore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobilestore.dto.MobileDTO;
import com.example.mobilestore.service.MobileService;

@RestController
@RequestMapping("/mobiles")

public class MobileController {
    private final MobileService mobileService;

    @Autowired
    public MobileController(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    @PostMapping
    public ResponseEntity<MobileDTO> createmobile(@Valid @RequestBody MobileDTO mobileDTO) {
        MobileDTO savedmobile = mobileService.createmobile(mobileDTO);
        return new ResponseEntity<>(savedmobile, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MobileDTO> getmobileById(@PathVariable("id") Long id) {
        MobileDTO mobileDTO = mobileService.getmobileById(id);
        return new ResponseEntity<>(mobileDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MobileDTO>> getAllmobiles() {
        List<MobileDTO> mobiles = mobileService.getAllmobiles();
        return new ResponseEntity<>(mobiles, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MobileDTO> updatemobile(@PathVariable("id") Long id,
                                                  @Valid @RequestBody MobileDTO mobileDTO) {

        MobileDTO updatedmobile = mobileService.updatemobile(id, mobileDTO);
        return new ResponseEntity<>(updatedmobile, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletemobile(@PathVariable("id") Long id) {
        mobileService.deletemobile(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MobileDTO>> searchmobiles(@RequestParam(value = "name", required = false) String name,
                                                         @RequestParam(value = "price", required = false) Double price,
                                                         @RequestParam(value = "brand", required = false) String brand) {
        List<MobileDTO> mobiles = mobileService.searchmobiles(name, price, brand);
        return new ResponseEntity<>(mobiles, HttpStatus.OK);
    }
}