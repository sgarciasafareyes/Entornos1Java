package modelos;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Restaurante {

    private String nombre;
    private String localizacion;
    private Integer mesas;
    private Double dimensiones;
    private Integer numeroTrabajadores;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private Boolean mercancia;
    private Double aforo;


}
