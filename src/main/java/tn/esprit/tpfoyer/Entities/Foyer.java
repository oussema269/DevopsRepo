package tn.esprit.tpfoyer.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;
    String nomF;
    long capaciteFoyer;
    //ASSOCIATIONS
    @OneToOne( mappedBy = "foyer")
    @JsonIgnore
    @ToString.Exclude
    Universite universite;
    @OneToMany(mappedBy = "foyer")
    @JsonIgnore
    @ToString.Exclude
    Set<Bloc> blocs;
}
