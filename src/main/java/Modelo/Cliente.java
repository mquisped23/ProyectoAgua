/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Cliente {
    
    private int id;
    private String nombre;
    private String Manzana;
    private String Etapa;
    private String mes;
    private int consumo1;
    private int consumo2;
    private int totalConsumo;
    private int totalAPagar;
    private String confirmacion;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String Manzana, String Etapa, int consumo1, int consumo2, int totalConsumo, int totalAPagar, String confirmacion) {
        this.id = id;
        this.nombre = nombre;
        this.Manzana = Manzana;
        this.Etapa = Etapa;
        this.consumo1 = consumo1;
        this.consumo2 = consumo2;
        this.totalConsumo = totalConsumo;
        this.totalAPagar = totalAPagar;
        this.confirmacion = confirmacion;
    }

    public Cliente(String nombre, String Manzana, String Etapa, int consumo1, int consumo2, int totalConsumo, int totalAPagar, String confirmacion) {
        this.nombre = nombre;
        this.Manzana = Manzana;
        this.Etapa = Etapa;
        this.consumo1 = consumo1;
        this.consumo2 = consumo2;
        this.totalConsumo = totalConsumo;
        this.totalAPagar = totalAPagar;
        this.confirmacion = confirmacion;
    }

    public Cliente(String nombre, String Manzana, String Etapa, String mes, int consumo1, String confirmacion) {
        this.nombre = nombre;
        this.Manzana = Manzana;
        this.Etapa = Etapa;
        this.mes = mes;
        this.consumo1 = consumo1;
        this.confirmacion = confirmacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getManzana() {
        return Manzana;
    }

    public void setManzana(String Manzana) {
        this.Manzana = Manzana;
    }

    public String getEtapa() {
        return Etapa;
    }

    public void setEtapa(String Etapa) {
        this.Etapa = Etapa;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getConsumo1() {
        return consumo1;
    }

    public void setConsumo1(int consumo1) {
        this.consumo1 = consumo1;
    }

    public int getConsumo2() {
        return consumo2;
    }

    public void setConsumo2(int consumo2) {
        this.consumo2 = consumo2;
    }

    public int getTotalConsumo() {
        return totalConsumo;
    }

    public void setTotalConsumo(int totalConsumo) {
        this.totalConsumo = totalConsumo;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    
    
        
}
