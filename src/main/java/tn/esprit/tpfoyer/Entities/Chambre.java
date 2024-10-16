package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
    //ASSOCIATIONS
    @ManyToOne(cascade = CascadeType.ALL)
    Bloc bloc;
    @OneToMany()
    Set<Reservation> reservations  ;
}
