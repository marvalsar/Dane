
package dane;

public class Departamento {
    private String nombre;
    private int numeroMunicipios;
    private double extensionMt2;
    private int numeroHabitantes;
    private double temperaturaPromedio;
    private String indicativoTelefonico;

    //Constructor
    public Departamento(String nombre, int numeroMunicipios, double extensionMt2, int numeroHabitantes, double temperaturaPromedio, String indicativoTelefonico) {
        this.nombre = nombre;
        this.numeroMunicipios = numeroMunicipios;
        this.extensionMt2 = extensionMt2;
        this.numeroHabitantes = numeroHabitantes;
        this.temperaturaPromedio = temperaturaPromedio;
        this.indicativoTelefonico = indicativoTelefonico;
    }
     
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMunicipios() {
        return numeroMunicipios;
    }

    public void setNumeroMunicipios(int numeroMunicipios) {
        this.numeroMunicipios = numeroMunicipios;
    }

    public double getExtensionMt2() {
        return extensionMt2;
    }

    public void setExtensionMt2(double extensionMt2) {
        this.extensionMt2 = extensionMt2;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public double getTemperaturaPromedio() {
        return temperaturaPromedio;
    }

    public void setTemperaturaPromedio(double temperaturaPromedio) {
        this.temperaturaPromedio = temperaturaPromedio;
    }

    public String getIndicativoTelefonico() {
        return indicativoTelefonico;
    }

    public void setIndicativoTelefonico(String indicativoTelefonico) {
        this.indicativoTelefonico = indicativoTelefonico;
    }

    
}
