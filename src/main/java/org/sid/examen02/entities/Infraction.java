package org.sid.examen02.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor
@Builder @Data
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Integer idRadar;
    private String numeroMatriculeVehicule;
    private Integer vitesseVoiture;
    private Integer vitesseMaximalRadar;
    private Integer montantInfraction;

}
