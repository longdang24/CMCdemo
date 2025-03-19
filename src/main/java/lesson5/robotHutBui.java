package lesson5;

public class robotHutBui {
    private String model;
    private  int theTich;
    private int trongLuong;
    private int luongNuoc;

    public robotHutBui(String model, int theTich){
        this.model = model;
        this.theTich= theTich;
        this.trongLuong = theTich * 2 +100;
        this.luongNuoc = 0;
    }

    public int getTrongLuong() {
        return this.trongLuong;

    }

    public void layNuoc(){
        this.luongNuoc = theTich;
    }

    public int chamNuoc(){
        int nuocDoRa = this.luongNuoc;
        return luongNuoc = 0;
    }








}
