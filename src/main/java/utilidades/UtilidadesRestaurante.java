package utilidades;

import modelos.Restaurante;

import java.time.LocalTime;

public class UtilidadesRestaurante {
    public void RestauranteSebas (Restaurante restaurante){
        restaurante.setNombre("La Gorda de Calatrava");
        restaurante.setLocalizacion("Sevilla");
        restaurante.setHoraApertura(LocalTime.of(8,0,0));
        restaurante.setHoraCierre(LocalTime.of(16,30, 00));
        restaurante.setMesas(5);
        restaurante.setDimensiones(10.0);
        restaurante.setNumeroTrabajadores(3);
        restaurante.setMercancia(false);
        restaurante.setAforo(restaurante.getDimensiones()*1.5);

    }
}
