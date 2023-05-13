//
//package com.sofiatarditti.SpringBoot.security.service;
//
//import com.sofiatarditti.SpringBoot.security.entity.Usuario;
//import com.sofiatarditti.SpringBoot.security.entity.UsuarioPrincipal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsImpl implements UserDetailsService{
//    @Autowired
//    UsuarioService usuarioService;
//
//    @Override
//    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
//       Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
//       return UsuarioPrincipal.build(usuario);
//    }
//}
