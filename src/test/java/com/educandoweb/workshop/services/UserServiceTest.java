package com.educandoweb.workshop.services;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.repositories.UserRepository;
import com.educandoweb.workshop.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(1L, "Maria Brown", "maria@gmail.com", "9999999", "Maria123");
    }

    @Test
    void shouldReturnAllUsers() {
        Mockito.when(repository.findAll())
                .thenReturn(List.of(user));

        List<User> result = service.findAll();

        assertEquals(1, result.size());
        Mockito.verify(repository).findAll();
    }

    @Test
    void shouldReturnUserWhenIdExists() {
        Mockito.when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        User result = service.findById(1L);

        assertNotNull(result);
        assertEquals("Maria Brown", result.getName());
    }

    @Test
    void shouldSaveUser() {
        Mockito.when(repository.save(user)).thenReturn(user);

        User result = service.insert(user);

        assertNotNull(result);
        Mockito.verify(repository).save(user);
    }

    @Test
    void shouldThrowExceptionWhenUserNotFound() {
        Mockito.when(repository.findById(1L))
                .thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class,
                () -> service.findById(1L));
    }


}