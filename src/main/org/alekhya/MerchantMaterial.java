package org.alekhya;

public class MerchantMaterial {


    private int meter;
    private int centimeter;

    public MerchantMaterial(int i, int i1) {
        this.meter=i;
        this.centimeter=i1;
    }

    public int getCentimeter() {
        return centimeter;
    }

    public int getMeter() {
        return meter;
    }

    public MerchantMaterial addMaterial(MerchantMaterial material_2) {
        return new MerchantMaterial(this.meter+material_2.getMeter(),this.centimeter+material_2.getCentimeter());

    }
}
