package org.example.devoirsurveillecomputer.dao.repositories;

import org.example.devoirsurveillecomputer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public List<Computer> findByProce(String proce);
}
