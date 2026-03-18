package instituto;

public class ValidadorRegistro {

    // Comprueba que el nombre no sea nulo ni esté vacío
    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    // Comprueba que la contraseña tenga al menos 8 caracteres
    public boolean validarPassword(String password) {
        return password != null && password.length() >= 8;
    }

    // Comprueba que el correo electrónico contenga una arroba '@'
    public boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }

    // Comprueba que la persona tenga 16 años o más
    public boolean validarEdad(int edad) {
        return edad >= 16;
    }
}
