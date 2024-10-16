package tn.esprit.tpfoyer.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;
    String nomBloc;
    long capaciteBloc;
    //ASSOCIATIONS
    @ManyToOne(cascade = CascadeType.ALL)
    Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    @JsonIgnore
    @ToString.Exclude
    Set<Chambre> Chambres = new HashSet<>();
}
