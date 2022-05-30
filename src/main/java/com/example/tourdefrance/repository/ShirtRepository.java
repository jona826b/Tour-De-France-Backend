package com.example.tourdefrance.repository;

import com.example.tourdefrance.model.Shirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShirtRepository extends JpaRepository<Shirt, Long> {
}
