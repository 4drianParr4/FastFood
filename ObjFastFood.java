package FastFood;
public class ObjFastFood {

    private int Tipo;
    private int Tamano;
    private int Cantidad;
    private double PrecioUnidad;
    private double TotalPagar;


    public ObjFastFood(int tipo, int tamano, int cantidad, double precioUnidad, double totalPagar){
        Tipo = tipo;
        Tamano = tamano;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
    }


    public ObjFastFood() {
    }


    public int getTipo() {
        return Tipo;
    }


    public void setTipo(int tipo) {
        Tipo = tipo;
    }


    public int getTamano() {
        return Tamano;
    }


    public void setTamano(int tamano) {
        Tamano = tamano;
    }


    public int getCantidad() {
        return Cantidad;
    }


    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }


    public double getPrecioUnidad() {
        return PrecioUnidad;
    }


    public void setPrecioUnidad(double precioUnidad) {
        PrecioUnidad = precioUnidad;
    }


    public double getTotalPagar() {
        return TotalPagar;
    }


    public void setTotalPagar(double totalPagar) {
        TotalPagar = totalPagar;
    }
    
}
