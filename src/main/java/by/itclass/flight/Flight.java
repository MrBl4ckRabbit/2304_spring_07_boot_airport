package by.itclass.flight;

import by.itclass.airplane.Airplane;
import by.itclass.passenger.Passenger;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "flight")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String number;
    @NonNull
    private String direction;
    @ManyToOne
    @NonNull
    private Airplane airplane;
    @OneToMany(mappedBy = "flight", fetch = FetchType.EAGER)
    private List<Passenger> passengers;

    public Flight(int id, @NonNull String number, @NonNull String direction, @NonNull Airplane airplane) {
        this.id = id;
        this.number = number;
        this.direction = direction;
        this.airplane = airplane;
    }
}
