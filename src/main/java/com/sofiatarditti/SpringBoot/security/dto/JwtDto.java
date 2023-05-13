//
//package com.sofiatarditti.SpringBoot.security.dto;
//
//import java.util.Collection;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//
//@Getter @Setter
//public class JwtDto {
//    
//    private String token;
//    private String bearer = "Bearer";
//    private String nombreUsuario;
//    private Collection<? extends GrantedAuthority> authorities;
//
//    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
//        this.token = token;
//        this.nombreUsuario = nombreUsuario;
//        this.authorities = authorities;
//    }
//    
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
//        this.authorities = authorities;
//    }
//    
//    
//    
//    
//}
