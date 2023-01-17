package com.example;

public class Product {
}
    //* atributos encapsulados (private)

    private String nombre;
    private Double price;
    private String tipo;
    private String material;
    private Float size;
    private Integer unitsAvailable;
    private Manufacturer brand;

    //* constructores:
    //		* vacío
    //		* con todos los parámetros

    public Product() { }
    public Product(String nombre, Double price, String tipo, String material, Float size, Integer unitsAvailable, Manufacturer brand) {

        this.nombre = nombre;
        this.price = price;
        this.tipo = tipo;
        this.material = material;
        this.size = size;
        this.unitsAvailable = unitsAvailable;
        this.brand = brand;
        



    }
}