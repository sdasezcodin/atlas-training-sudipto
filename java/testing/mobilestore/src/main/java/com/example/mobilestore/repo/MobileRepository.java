package com.example.mobilestore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobilestore.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long> {
    List<Mobile> findByName(String name);
    List<Mobile> findByPrice(Double price);
    List<Mobile> findByBrand(String brand);
    List<Mobile> findByNameOrPriceOrBrand(String name, Double price, String brand);
}
