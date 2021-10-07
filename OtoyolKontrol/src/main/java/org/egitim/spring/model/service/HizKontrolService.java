package org.egitim.spring.model.service;

public class HizKontrolService {
    private Integer azamiHiz;

    private HizKontrolService(Integer azamiHiz) {
        this.azamiHiz = azamiHiz;
    }

    public Integer getAzamiHiz() {
        return azamiHiz;
    }

    public void setAzamiHiz(Integer azamiHiz) {
        this.azamiHiz = azamiHiz;
    }
}
