/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaDeCadastro;


/**
 *
 * @author Caue
 */
public class Consumo {
    private int tempBanho;
    private int tempLouca;
    private int tempEscovDent;
    private int tempDescarga;
    private int litros;
    
    public Consumo (int tempBanho, int tempLouca, int tempEscovDent, int tempDescarga, int litros){
    
    this.tempBanho = tempBanho;
    this.tempLouca = tempLouca;
    this.tempEscovDent = tempEscovDent;
    this.tempDescarga = tempDescarga;
    this.litros = litros;
    
    }
       public int getTempBanho() {
        return tempBanho;
    }

    
    public void setTempBanho(int tempBanho) {
        this.tempBanho = tempBanho;
    }
    public int getTempLouca() {
        return tempLouca;
    }

    
    public void setTempLouca(int tempLouca) {
        this.tempLouca = tempLouca;
    }
    public int getTempEscovDent() {
        return tempEscovDent;
    }

    
    public void setTempEscovDent(int tempEscovDent) {
        this.tempEscovDent = tempEscovDent;
    }
    public int getTempDescarga() {
        return tempDescarga;
    }

    
    public void setTempDescarga(int tempDescarga) {
        this.tempDescarga = tempDescarga;
    }
     public int getLitros() {
        return litros;
    }

    
    public void setLitros(int litros) {
        this.litros = litros;
    }
}
