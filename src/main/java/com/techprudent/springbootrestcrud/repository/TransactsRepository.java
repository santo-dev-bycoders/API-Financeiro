package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Transacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactsRepository extends JpaRepository<Transacts, Long> {

        Transacts findTransactsById(Long id);

}
