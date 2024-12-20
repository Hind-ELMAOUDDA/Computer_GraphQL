package org.example.devoirsurveillecomputer.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id_Pc;
    public String proce;
    public String ram;
    public String hardDrive;
    public double price;
    public String macAddress;
}
