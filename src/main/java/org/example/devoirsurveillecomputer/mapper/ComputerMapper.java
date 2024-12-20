package org.example.devoirsurveillecomputer.mapper;

import org.example.devoirsurveillecomputer.dao.entities.Computer;
import org.example.devoirsurveillecomputer.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();

    //fromComputerDtoToComputer
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    //fromComputerToComputerDto
    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }
}
