package org.example.devoirsurveillecomputer.web;

import lombok.AllArgsConstructor;

import org.example.devoirsurveillecomputer.dto.ComputerDto;
import org.example.devoirsurveillecomputer.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto){
        return computerService.saveComputer(computerDto);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }

}