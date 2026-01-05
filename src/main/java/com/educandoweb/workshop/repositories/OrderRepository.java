package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
