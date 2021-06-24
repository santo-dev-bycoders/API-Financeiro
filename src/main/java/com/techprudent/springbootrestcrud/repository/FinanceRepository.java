package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FinanceRepository extends JpaRepository<Finance, Long> {

        Finance findFinanceById(Long id);
        @Query(value = "SELECT sum(Valor) FROM finance;", nativeQuery = true)
        int countValue();

}
