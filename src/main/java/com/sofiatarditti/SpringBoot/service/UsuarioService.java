//package com.sofiatarditti.SpringBoot.service;
//
//import com.sofiatarditti.SpringBoot.model.Usuario;
//import com.sofiatarditti.SpringBoot.repository.IUsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UsuarioService implements UserDetailsService{
//    @Autowired
//    private IUsuarioRepository usuarioRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public Usuario findByUsername(String username) {
//        return usuarioRepository.findByUsername(username);
//    }
//
//    public boolean verificarPassword(Usuario usuario, String password) {
//        return passwordEncoder.matches(password, usuario.getPassword());
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Usuario usuario = usuarioRepository.findByUsername(username);
//        if (usuario == null) {
//            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
//        }
//        return User.withUsername(usuario.getUsername())
//                .password(usuario.getPassword())
//                .roles(usuario.getRole())
//                .build();
//    }
//}
