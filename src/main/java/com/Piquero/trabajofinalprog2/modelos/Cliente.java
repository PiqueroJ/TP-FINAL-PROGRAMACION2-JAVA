package com.Piquero.trabajofinalprog2.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    
    @NotBlank
    @Column(name = "apellido", length = 100, nullable = false)
    private String apellido;
    
    @Column(name = "razon_social", length = 100)
    private String razonSocial;
    
    @NotBlank
    @Column(name = "cuil", length = 13, nullable = false, unique = true)
    private String cuil;

    @Column(name = "Telefono", length = 20)
    private String telefono;
    
    @NotBlank
    @Email
    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String mail;
    
    @Column(name = "direccion", length = 150)
    private String direccion;
    
    @NotBlank
    @Column(name = "tipo_cliente", length = 100, nullable = false)
    private String tipoCliente;
    
}
