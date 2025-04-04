package com.jpgedvila.clientcrud.repositories;

import com.jpgedvila.clientcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
