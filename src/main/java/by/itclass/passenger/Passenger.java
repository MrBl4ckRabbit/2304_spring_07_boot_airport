package by.itclass.passenger;

import by.itclass.airplane.Airplane;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "passenger")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String fio;
    @ManyToOne
    private Airplane airplane;
}
