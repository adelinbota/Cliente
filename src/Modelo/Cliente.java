/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author daw-B
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String segundoapellido;
    private String estadocivil;
    private String sexo;
    private String edad;

    public Cliente(String nombre, String apellido, String segundoapellido, String estadocivil, String sexo, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoapellido = segundoapellido;
        this.estadocivil = estadocivil;
        this.sexo = sexo;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the segundoapellido
     */
    public String getSegundoapellido() {
        return segundoapellido;
    }

    /**
     * @param segundoapellido the segundoapellido to set
     */
    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    /**
     * @return the estadocivil
     */
    public String getEstadocivil() {
        return estadocivil;
    }

    /**
     * @param estadocivil the estadocivil to set
     */
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + ", " + apellido + ", " + segundoapellido + ", " + estadocivil + ", " + sexo + ", " + edad + '.' + "\n";
    }
    
    
}
