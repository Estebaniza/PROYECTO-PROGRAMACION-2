package proyectodb;

class ParkingSpace {
    public int id;
    public String placa;
    public String tipoVehiculo;
    public String estado;
    public String color;
    public
     int espacio;

    // Constructor
    public ParkingSpace(int id, String placa, String tipoVehiculo, String estado, String color, int espacio) {
        this.id = id;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.color = color;
        this.espacio = espacio;
    }

    // Getters
    public int getId() { return id; }
    public String getPlaca() { return placa; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public String getEstado() { return estado; }
    public String getColor() { return color; }
    public int getEspacio() { return espacio; }

    // Sobrescribir el método toString para una salida más legible
    @Override
    public String toString() {
        return String.format("ID: %d | Placa: %s | Tipo: %s | Estado: %s | Color: %s | Espacio: %d", 
                              id, placa, tipoVehiculo, estado, color, espacio);
    }
}
