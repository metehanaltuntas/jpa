package org.egitim.spring.model.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Arac {
    private String plakaNo;
    private String marka;
    private String model;

    public Arac(String plakaNo, String marka, String model) {
        this.plakaNo = plakaNo;
        this.marka = marka;
        this.model = model;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "plakaNo='" + plakaNo + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
