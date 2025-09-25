package com.example.mobilestore.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.mobilestore.dto.MobileDTO;
import com.example.mobilestore.entity.Mobile;
import com.example.mobilestore.exception.ResourceNotFoundException;
import com.example.mobilestore.repo.MobileRepository;
import com.example.mobilestore.service.impl.MobileServiceImpl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)  // automatically initializes mocks
public class MobileServiceTests {

    @Mock
    private MobileRepository mobileRepository;

    @InjectMocks
    private MobileServiceImpl mobileService;

    private Mobile mobile = new Mobile(1L, "iPhone", 999.0, "Apple", "128GB", "6GB", "A15");

    @Test
    void testGetMobileById_Success() {
        when(mobileRepository.findById(1L)).thenReturn(Optional.of(mobile));

        MobileDTO result = mobileService.getmobileById(1L);

        assertNotNull(result);
        assertEquals("iPhone", result.getName());
        assertEquals("Apple", result.getBrand());
    }

    @Test
    void testGetMobileById_NotFound() {
        when(mobileRepository.findById(2L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> mobileService.getmobileById(2L));
    }

    @Test
    void testGetAllMobiles() {
        when(mobileRepository.findAll()).thenReturn(Arrays.asList(mobile));

        List<MobileDTO> result = mobileService.getAllmobiles();

        assertEquals(1, result.size());
        assertEquals("iPhone", result.get(0).getName());
    }
}
