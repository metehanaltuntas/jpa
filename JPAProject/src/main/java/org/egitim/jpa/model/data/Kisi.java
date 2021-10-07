package org.egitim.jpa.model.data;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Strings;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "KISI")
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, insertable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ISLEM_ZAMAN", nullable = false)
    private Date islemZaman;

    @Column(name = "TC_KIMLIK_NO", length = 11, unique = true, nullable = false)
    private String tcKimlikNo;

    @Column(name = "AD", length = 1, nullable = false)
    private String ad;

    @Column(name = "SOYAD", length = 1, nullable = false)
    private String soyad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIslemZaman() {
        return islemZaman;
    }

    public void setIslemZaman(Date islemZaman) {
        this.islemZaman = islemZaman;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", islemZaman=" + islemZaman +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
