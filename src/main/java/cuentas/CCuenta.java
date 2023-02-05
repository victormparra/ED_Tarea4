package cuentas;

/**
 * Clase `CCuenta` que representa una cuenta bancaria
 *
 * @author victorm.parra
 */
public class CCuenta {

    // Atibutos de la clase CCuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa los atributos de la clase CCuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo disponible en la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que devuelve el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un nombre al titular de la cuenta.
     *
     * @param nombre Nombre a asignar al titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que asigna un nombre al titular de la cuenta.
     *
     * @param nombre Nombre a asignar al titular de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que asigna un número de cuenta.
     *
     * @param cuenta Número de cuenta a asignar.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo disponible en la cuenta.
     *
     * @return Saldo disponible en la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que asigna un saldo a la cuenta.
     *
     * @param saldo Saldo a asignar a la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * Método que devuelve el tipo de interés actual de la cuenta.
     *
     * @return El tipo de interés actual de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * Método que establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     *
     * Método que devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     *
     * Método que permite ingresar una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa, se lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * Método que permite retirar una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
     * en la cuenta, se lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

}
