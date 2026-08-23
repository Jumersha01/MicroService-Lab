package com.nt.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Pr")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {

 @Id	
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;
 
 @NonNull
 private String name;
 private Double price;
 private Integer quantity;
 
}
