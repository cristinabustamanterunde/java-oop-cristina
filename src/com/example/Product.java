package com.example;

public class Product {
}
    //* atributos encapsulados (private)

    private String nombre;
    private Double price;
    private String category;
    private String material;
    private Float size;
    private Integer unitsAvailable;
    private Manufacturer brand;

    //* constructores:
    //		* vacío
    //		* con todos los parámetros

    public Product() { }
    public Product(String nombre, Double price, Category category, String material, Float size, Integer unitsAvailable, Manufacturer brand) {

        this.setNombre(nombre);
        this.setPrice(price)


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Integer getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(Integer unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }

    public Manufacturer getBrand() {
        return brand;
    }

    public void setBrand(Manufacturer brand) {
        this.brand = brand;
    }
}