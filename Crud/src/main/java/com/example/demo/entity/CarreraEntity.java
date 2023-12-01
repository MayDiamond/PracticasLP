package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CARRERA")
public class CarreraEntity implements Serializable {
private static final long serialVersionUID = -2170897015344177815L;

@Id
@Column(name = "ID_CARRERA")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCarrera")
@SequenceGenerator(sequenceName = "SEQ_CARRERA", allocationSize = 1, name = "seqCarrera")
private Long id;

@Column(name = "NOMBRE")
	private String nombre;

@Column(name = "ESTADO")
	private String estado;
	
}
