package com.salesianostriana.ejercicio02;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Monument {

    @Id
    @GeneratedValue
    private Long id;

    private String codPais;
    private String nPais;
    private String nCiudad;
    private String localizacion;
    private String nombreMonumento;
    private String descripcion;
    private String urlFoto;

    public Monument(String codPais, String nPais, String nCiudad, String localizacion, String nombreMonumento, String descripcion, String urlFoto) {
        this.codPais = codPais;
        this.nPais = nPais;
        this.nCiudad = nCiudad;
        this.localizacion = localizacion;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
    }
}
