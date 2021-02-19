/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;

/**
 *Clase que representa una cuenta bancaria.
 * @author Albero
 * @version 1.0
 */
public class CCuenta {


  /**
   * Nombre de la persona propietaria de la cuenta.
   * Numero de la cuenta bancaria.
   * Saldo que tiene la cuenta bancaria.
   * Tipo de interes bancario.
   */
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   *Constructor sin argumentos.
   */
    public CCuenta ()
    {
    }
   /**
    Constructor de la clase CCuenta
    * @param nom nombre de la persona.
    * @param cue cuenta bancaria.
    * @param sal salario de la cuenta.
    * @param tipo tipo de interés.
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  
    /**
     * Modificar el nombre de la cuenta.
     * @param nom nuevo nombre para la cuenta bancaria.
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *Devuelve el nombre de la cuenta.
     * @return <code>nombre</code> devuelve el nombre de la cuenta.
     */
    public String obtenerNombre()
    {
        return nombre;
    }
    
    /**
     *Devuelve la cantidad de salario en la cuenta.
     * @return <code>saldo</code> devuelve el salario de la cuenta.
     */
    
     public double estado ()
    {
        return saldo;
    }

    /**
     *Ingresar cantidad de saldo a la cuenta
     * @param cantidad cantidad a ingresar.
     * @throws Exception No se puede ingresar una cantidad menor que 0
    */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *Retirar cantidad de saldo a la cuenta.
     * @param cantidad cantidad a retirar.
     * @throws Exception  No puede retirar una cantidad de saldo negativo ni superar el saldo.
     */
    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Devuelve la cuenta bancaria.
     * @return <code>cuenta</code> devuelve la cuenta bancaria.
     */
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  
    /**
     *Modificar la cuenta bancaria
     * @param cuenta nuevo numero de la cuenta bancaria.
     */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   *Modificar la cantidad de saldo de la cuenta
   * @param saldo cambiar el saldo al nuevo saldo.
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   *Devuelve el tipo de interes de la cuenta bancaria
   * @return <code>tipoInterés</code> devuelve el tipo de interes de la cuenta bancaria.
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   *Modificar el tipo de interes
   * @param tipoInterés cambiar el tipo de interés.
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
