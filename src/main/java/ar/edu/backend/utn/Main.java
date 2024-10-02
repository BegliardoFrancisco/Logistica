package ar.edu.backend.utn;

import ar.edu.backend.utn.agrupamiento.Logistica;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        URL location = Main.class.getResource("/logistica.csv");

        try {
            if (location != null){
                logistica.insertToCsv(location.toURI());
            } else {
                System.out.println("Archivo no encontrado");
            }
        } catch (URISyntaxException e) {
            System.out.println("URL mal formada");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");

        }

    }
}