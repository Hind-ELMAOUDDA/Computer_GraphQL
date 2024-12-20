package org.example.devoirsurveillecomputer.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ComputerDto {
    public String proce;
    public String ram;
    public String hardDrive;
    public double price;
}
