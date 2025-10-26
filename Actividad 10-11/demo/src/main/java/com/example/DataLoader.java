package com.example;

public class DataLoader {
//crea lo necesario para que la clase DataLoader pueda cargar datos desde un archivo CSV
    private String filePath;

    //Constructor
    public DataLoader(String filePath) {
        this.filePath = filePath;
    }

    //Metodo para cargar datos
    public java.util.List<Pais> loadData() {
        java.util.List<Pais> paises = new java.util.ArrayList<>();
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 2) {
                    Pais pais = new Pais(values[0], values[1]);
                    paises.add(pais);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
}
       return paises;
    }
}
