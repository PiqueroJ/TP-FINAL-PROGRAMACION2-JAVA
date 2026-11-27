package com.Piquero.trabajofinalprog2.modelos;

import com.Piquero.trabajofinalprog2.utilidades.EstadoHerramientas;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "herramientas")
@Getter
@Setter
@NoArgsConstructor
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false)
    private Integer id;
    
    @NotBlank
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    
    @NotBlank
    @Column(name = "descripcion", length = 150, nullable = false)
    private String descripcion;
    
    @NotBlank
    @Column(name = "categoria", length = 100, nullable = false)
    private String categoria;
    
    @NotBlank
    @Column(name = "marca", length = 100, nullable = false)
    private String marca;
    
    @NotBlank
    @Column(name = "modelo", length = 100, nullable = false)
    private String modelo;
    
    @NotNull
    @DecimalMin(value = "0.0" , inclusive = false)
    @Column(name = "Precia_Por_Dia", nullable = false, precision = 10, scale = 2)
    private float precioDia;
    
    @NotNull
    @Min(0)
    @Column(name = "cantidad_Disponible", nullable = false)
    private Integer cantidad;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", length = 100, nullable = false)
    private EstadoHerramientas estado;
    
}
