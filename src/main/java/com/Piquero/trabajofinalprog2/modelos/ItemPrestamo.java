package com.Piquero.trabajofinalprog2.modelos;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items_prestamo")
@Getter 
@Setter 
@NoArgsConstructor
public class ItemPrestamo {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "prestamo_id", nullable = false)
    private Prestamo prestamo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "herramienta_id", nullable = false)
    private Herramienta herramienta;

    @NotNull
    @Min(1)
    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @NotNull 
    @Column(name = "precio_por_dia", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioPorDia; // copia del precio de la herramienta al prestar
}
