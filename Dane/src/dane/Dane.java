package dane;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Dane {
    public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        
        String input = JOptionPane.showInputDialog("Ingrese el número de departamentos:");
        int numeroDeptos = Integer.parseInt(input);
        
        for(int i=0;i<numeroDeptos;i++){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del departamento "+(i+1)+":");
            int numeroMunicipios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de municipios del departamento"+(i+1)+":"));
            double extensionMt2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la extensión de tierra en mt2 del departamento "+(i+1)+":"));
            int numeroHabitantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el núero de habitantes del departamento"+(i+1)+":"));
            double temperaturaPromedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura promedio en grados Celsius del departamento"+(i+1)+":"));
            String indicativoTelefonico = JOptionPane.showInputDialog("Ingresa el indicativo telefónico del departamento"+(i+1)+":");
            
            departamentos.add(new Departamento(nombre, numeroMunicipios, extensionMt2, numeroHabitantes, temperaturaPromedio, indicativoTelefonico));
        }
        //Inicializar las variables para almacenar los resultados
        Departamento mayorExtension = null;
        Departamento menorTemperatura = null;
        Departamento mayorHabitantes = null;
        Departamento menorExtension = null;
        
        //Encontrar los departamentos deseados
        for (Departamento d : departamentos) {
            if (mayorExtension == null || d.getExtensionMt2() > mayorExtension.getExtensionMt2()) {
                mayorExtension = d;
            }
            if (menorTemperatura == null || d.getTemperaturaPromedio() < menorTemperatura.getTemperaturaPromedio()) {
                menorTemperatura = d;
            }
            if (mayorHabitantes == null || d.getNumeroHabitantes() > mayorHabitantes.getNumeroHabitantes()) {
                mayorHabitantes = d;
            }
            if (menorExtension == null || d.getExtensionMt2() < menorExtension.getExtensionMt2()) {
                menorExtension = d;
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Departamento con mayor extensión: " + mayorExtension.getNombre() + " con " + mayorExtension.getExtensionMt2() + " mt2");
        JOptionPane.showMessageDialog(null, "Departamento con menor temperatura: " + menorTemperatura.getNombre() + " con " + menorTemperatura.getTemperaturaPromedio() + " °C");
        JOptionPane.showMessageDialog(null, "Departamento con mayor número de habitantes: " + mayorHabitantes.getNombre() + " con " + mayorHabitantes.getNumeroHabitantes() + " habitantes");
        JOptionPane.showMessageDialog(null, "Departamento con menor extensión: " + menorExtension.getNombre() + " con " + menorExtension.getExtensionMt2() + " mt2");
   
    }
    
}
