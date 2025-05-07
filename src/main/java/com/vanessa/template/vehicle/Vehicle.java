package com.vanessa.template.vehicle;


import com.vanessa.template.owner.Owner;
import com.vanessa.template.platenumbers.PlateNumber;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private UUID id;

    private String chassisNumber;
    private String manufacturerCompany;
    private int manufactureYear;
    private double price;
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "current_owner_id", nullable = false)
    private Owner currentOwner;

    @OneToOne
    @JoinColumn(name = "plate_number_id", unique = true)
    private PlateNumber plateNumber;
}
