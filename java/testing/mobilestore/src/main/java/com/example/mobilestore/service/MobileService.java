package com.example.mobilestore.service;

import java.util.List;

import com.example.mobilestore.dto.MobileDTO;

public interface MobileService {
    List<MobileDTO> getAllmobiles();
    MobileDTO getmobileById(Long id);
    MobileDTO createmobile(MobileDTO mobileDTO);
    MobileDTO updatemobile(Long id, MobileDTO mobileDTO);
    boolean deletemobile(Long id);
    List<MobileDTO> searchmobilesByName(String name);
    List<MobileDTO> searchmobilesByPrice(Double price);
    List<MobileDTO> searchmobilesByBrand(String brand);
    List<MobileDTO> searchmobiles(String name, Double price, String brand);
}
