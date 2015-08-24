package org.alekhya;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void shouldCalculateTotalMaterialInMeter()
    {
        MerchantMaterial material_1=new MerchantMaterial(123,56);
        MerchantMaterial material_2=new MerchantMaterial(3,0);
        MerchantMaterial material_total=material_1.addMaterial(material_2);
        assertEquals(126, material_total.getMeter());


    }
}
