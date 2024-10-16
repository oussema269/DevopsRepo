package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    String idReservation;
    Date anneeUniversitaire;
    boolean estValide;
    //ASSOCIATIONS
    @ManyToMany
    Set<Etudiant> etudiants;
}
