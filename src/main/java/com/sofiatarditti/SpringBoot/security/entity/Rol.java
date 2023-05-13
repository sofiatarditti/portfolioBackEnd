//
//package com.sofiatarditti.SpringBoot.security.entity;
//
//import com.sofiatarditti.SpringBoot.security.enums.RolNombre;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter @Setter
//@Entity
//public class Rol {
//    
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private int id;
//    @Enumerated(EnumType.STRING)
//    private RolNombre rolNombre;
//
//    public Rol() {
//    }
//
//    public Rol(RolNombre rolNombre) {
//        this.rolNombre = rolNombre;
//    }
//    
//    
//}
