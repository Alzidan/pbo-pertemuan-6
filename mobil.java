package com.PBOALZIDAN;

public class mobil extends kendaraan{
    private String model;

    public Mobil(String merek, String model){
        super(merek);
    }

    public String getModel() {
        return model;
    }

    public void viewData() {
        System.out.println("Merek: " + this.getMerek());
        System.out.println("Model: " + getModel());
    }
}