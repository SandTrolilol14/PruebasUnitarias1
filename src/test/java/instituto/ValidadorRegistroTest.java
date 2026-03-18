package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // --- AQUÍ EMPIEZAN LOS 5 RETOS ---

    @Test
    @DisplayName("Reto 1: Nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");

        // Esperamos FALSE porque un nombre vacío no es válido
        assertFalse(resultado, "Error: El sistema aceptó un nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Contraseña justa de 8 caracteres")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");

        // Esperamos TRUE porque 8 caracteres cumple el límite justo
        assertTrue(resultado, "Error: El sistema rechazó una contraseña de exactamente 8 caracteres");
    }

    @Test
    @DisplayName("Reto 3: Contraseña corta debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");

        // Esperamos FALSE porque 5 caracteres no son suficientes
        assertFalse(resultado, "Error: El sistema aceptó una contraseña de menos de 8 caracteres");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");

        // Esperamos FALSE porque le falta el carácter '@'
        assertFalse(resultado, "Error: El sistema aceptó un email sin arroba");
    }

    @Test
    @DisplayName("Reto 5: Edad mínima legal (16 años) permitida")
    public void testEdadLimite() {
        boolean resultado = validador.validarEdad(16);

        // Esperamos TRUE porque justo 16 años es la edad permitida
        assertTrue(resultado, "Error: El sistema rechazó la edad límite legal de 16 años");
    }
}

