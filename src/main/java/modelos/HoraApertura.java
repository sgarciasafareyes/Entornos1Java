package modelos;
import lombok.*;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoraApertura {
    private LocalTime horaApertura;

}
