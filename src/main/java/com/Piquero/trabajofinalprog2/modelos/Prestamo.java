package com.Piquero.trabajofinalprog2.modelos;

import com.Piquero.trabajofinalprog2.utilidades.EstadoPrestamo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Prestamos")
@Getter
@Setter
@NoArgsConstructor
public class Prestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestamo", length = 11, nullable = false)
    private Integer idPrestamo;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    
    @Column(name = "fecha_prestamo", nullable = false)
    private LocalDate fechaPrestamo;
    
    @NotNull
    @Min(1)
    @Column(name = "cantidad_Dias", length = 100, nullable = false)
    private Integer cantidadDias;

    @Column(name = "fecha_devolucion_prevista", nullable = false)
    private LocalDate fechaPrevista;
    
    @Column(name = "fecha_devolucion_real", nullable = true)
    private LocalDate fechaReal;
    
    @Column(name = "importe_total", nullable = false, precision = 12, scale = 2)
    private BigDecimal importeTotal; //BD para evitar errores de redondeo
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", length = 30, nullable = false)
    private EstadoPrestamo estado = EstadoPrestamo.ACTIVO;
    
    @OneToMany(mappedBy = "prestamo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPrestamo> items = new ArrayList<>();
    
}
