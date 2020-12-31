package test;

import java.util.Arrays;
import vehiculo.Vehiculo;

public class Test {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[]{new Vehiculo("Peugeot", "206", 4, 200000.0D), new Vehiculo("Homda", "titan", "125cc", 60000.0D), new Vehiculo("Peugeot", "208", 5, 250000.0D), new Vehiculo("Yamaha", "YBR", "160cc", 80500.0D)};

        double max = vehiculos[0].getPrecio();
        double min = vehiculos[0].getPrecio();

        int i;
        for (i = 0; i < vehiculos.length; ++i) {
            if (max < vehiculos[i].getPrecio()) {
                max = vehiculos[i].getPrecio();
            }

            if (min > vehiculos[i].getPrecio()) {
                min = vehiculos[i].getPrecio();
            }
        }

      System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("el vehiculo de mayor valor es : " + max +"\n"+ "\nel vehiculo con menor valor es : " + min);

        int j;
        for (i = 0; i < vehiculos.length; ++i) {
            String letra = vehiculos[i].getModelo().toLowerCase();

            for (j = 0; j < letra.length(); ++j) {
                if (letra.charAt(j) == 'y') {
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("El modelo que contiene la letra \"y\" es : " + letra + " Marca " + vehiculos[i].getNombre());

                }
            }
        }

        Arrays.sort(vehiculos);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("vehiculos ordenados de mayor a menor");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        for (Vehiculo e : vehiculos) {

            System.out.println(e.toString());
            System.out.println("");
        }

    }
}
