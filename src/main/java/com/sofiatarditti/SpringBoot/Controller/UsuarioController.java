//import com.sofiatarditti.SpringBoot.Util.JwtTokenUtil;
//import com.sofiatarditti.SpringBoot.model.JwtResponse;
//import com.sofiatarditti.SpringBoot.model.LoginRequest;
//import com.sofiatarditti.SpringBoot.service.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//public class UsuarioController {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UsuarioService usuarioService;
//    
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
//        );
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        UserDetails userDetails = usuarioService.loadUserByUsername(loginRequest.getUsername());
//        String token = jwtTokenUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new JwtResponse(token));
//    }
//
//    @GetMapping("/user")
//    public ResponseEntity<?> user() {
//        return ResponseEntity.ok("¡Bienvenido! Esta es la información pública de mi portfolio.");
//    }
//
//    @GetMapping("/admin")
//    public ResponseEntity<?> admin() {
//        return ResponseEntity.ok("¡Bienvenido, administrador! Esta es la información privada de mi portfolio.");
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<?> handleException(Exception e) {
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//    }
//}
