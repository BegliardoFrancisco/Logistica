package ar.edu.backend.utn.agrupamiento;

import ar.edu.backend.utn.entities.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Arrays;
import java.util.Scanner;

public class Logistica {
    private HojaDeRuta[] hojasRuta;
    private Integer lastusedIndex;
    private TipoBuque[] tipobuque;

    public Logistica() {
        this.hojasRuta = new HojaDeRuta[10];
        this.lastusedIndex = 0;
        this.tipobuque = new  TipoBuque[3];
        this.tipobuque[0] = new TipoBuque(1, "Cerealero");
        this.tipobuque[1] = new TipoBuque(2, "Tanquer");
        this.tipobuque[2] = new TipoBuque(3,"Containers");
    }

    public HojaDeRuta[] getHojasRuta() {
        return hojasRuta;
    }

    public void setHojasRuta(HojaDeRuta[] hojasRuta) {
        this.hojasRuta = hojasRuta;
    }

    public Integer getLastusedIndex() {
        return lastusedIndex;
    }

    public void setLastusedIndex(Integer lastusedIndex) {
        this.lastusedIndex = lastusedIndex;
    }


    public void insertToCsv(URI path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        boolean first = true;
        while (sc.hasNextLine()) {

            if (first) {
                first = false;
                continue;
            }
            String line = sc.nextLine();
            try {
                HojaDeRuta hojaDeRuta = this.buildHojaDeRuta(line);
                this.add(hojaDeRuta);

            }  catch (NumberFormatException e) {
                System.out.println("Archivo no en formato");
            }
        }
        sc.close();
    }

    public void add(HojaDeRuta hojaRuta) {
        if (lastusedIndex == this.hojasRuta.length) {
            HojaDeRuta[] newHojasRuta = new HojaDeRuta[2 * this.hojasRuta.length];
            System.arraycopy(this.hojasRuta,0,newHojasRuta,0,lastusedIndex);
            this.hojasRuta = newHojasRuta;
        }
        hojasRuta[lastusedIndex] = hojaRuta;
        lastusedIndex ++ ;
    }


    private HojaDeRuta buildHojaDeRuta(String line) throws NumberFormatException{
        var items = line.split(";");

        HojaDeRuta hojaRuta = new HojaDeRuta();

        hojaRuta.setCodigo(items[0]);
        hojaRuta.setOrigen(items[1]);
        hojaRuta.setDestino(items[2]);
        hojaRuta.setNombreCliente(items[3]);

        String matricula = items[4];
        float precio_base = Float.parseFloat(items[5]);
        String nombre = items[6];

        // Si es Transporte Aereo
        int bultos = Integer.parseInt(items[7]);
        float precioComb = Float.parseFloat(items[8]);

        // Si es Transporte Maritimo
        int tipoDeBuque = Integer.parseInt(items[9]);
        int toneladas = Integer.parseInt(items[10]);

        Transporte t = null;

        if (bultos == 0) {
            t = new Maritimo(matricula,precio_base,nombre,this.tipobuque[tipoDeBuque-1],toneladas);
        } else {
            t = new Aereo(matricula,precio_base, nombre,bultos,precioComb);
        }
        hojaRuta.setTransporte(t);

        return hojaRuta;
    }

    @Override
    public String toString() {
        return "Logistica{" +
                "hojasRuta=" + Arrays.toString(hojasRuta) +
                ", lastusedIndex=" + lastusedIndex +
                ", tipobuque=" + Arrays.toString(tipobuque) +
                '}';
    }
}
