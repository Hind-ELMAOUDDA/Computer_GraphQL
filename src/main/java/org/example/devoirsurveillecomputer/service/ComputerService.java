package org.example.devoirsurveillecomputer.service;

import org.example.devoirsurveillecomputer.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer(ComputerDto computerDto);
    public List<ComputerDto> getComputerByProce(String proce);
}
