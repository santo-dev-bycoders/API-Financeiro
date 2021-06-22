package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinanceRepository extends JpaRepository<Finance, Long> {

        Finance findFinanceById(Long id);

}
