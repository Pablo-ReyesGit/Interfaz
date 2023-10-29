/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

/**
 *
 * @author pablo
 */
public class FacturaCarrito {
    private int id;
    private String combo;
    private String InicioEstadia;
    private int noches;
    private double precio;

    public FacturaCarrito(String combo, String inicioEstadia, int noches, double precio) {
        this.combo = combo;
        this.InicioEstadia = inicioEstadia;
        this.noches = noches;
        this.precio = precio;
    }
    
    public FacturaCarrito() {
        this.combo = combo;
        this.InicioEstadia = InicioEstadia;
        this.noches = noches;
        this.precio = precio;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the combo
     */
    public String getCombo() {
        return combo;
    }

    /**
     * @param combo the combo to set
     */
    public void setCombo(String combo) {
        this.combo = combo;
    }

    /**
     * @return the InicioEstadia
     */
    public String getInicioEstadia() {
        return InicioEstadia;
    }

    /**
     * @param InicioEstadia the InicioEstadia to set
     */
    public void setInicioEstadia(String InicioEstadia) {
        this.InicioEstadia = InicioEstadia;
    }

    /**
     * @return the noches
     */
    public int getNoches() {
        return noches;
    }

    /**
     * @param noches the noches to set
     */
    public void setNoches(int noches) {
        this.noches = noches;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    void setInicioEstadia(int InicioEstadia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
