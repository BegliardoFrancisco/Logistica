package ar.edu.backend.utn.agrupamiento;

import ar.edu.backend.utn.entities.HojaDeRuta;

public class Logistica {
    private HojaDeRuta[] hojasRuta;
    private Integer lastusedIndex;

    public Logistica(HojaDeRuta[] hojasRuta, Integer lastusedIndex) {
        this.hojasRuta = hojasRuta;
        this.lastusedIndex = lastusedIndex;
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
}
