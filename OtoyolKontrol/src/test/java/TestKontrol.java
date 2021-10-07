import org.egitim.spring.model.data.Arac;
import org.egitim.spring.model.data.Otoyol;
import org.egitim.spring.model.service.HizKontrolService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestKontrol {
    @Test
    void name() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        System.out.println("Context @:" + applicationContext);

        HizKontrolService hizKontrolService = applicationContext.getBean("hizKontrolService", HizKontrolService.class);
        System.out.println("Genel azami hız:" + hizKontrolService.getAzamiHiz());

        Arac arac = (Arac) applicationContext.getBean("arac", "06XZ9999", "AUDI", "A6");
        System.out.println(arac);

        Arac arac2 = (Arac) applicationContext.getBean("arac", "01XAB1239", "MERCEDES", "C180");
        System.out.println(arac2);

        // bu şekilde constructor ile yaaprsan koda dönüp baktığında neyi set ettiğni anlayamazsın. bu yüzden setter' ları kullan
        /*Otoyol otoyol = (Otoyol) applicationContext.getBean("otoyol", "E-291", 111.3, 100, 82.4, 7.30, 12.47, -5.2);
        System.out.println(otoyol);*/

        Otoyol otoyol1 = applicationContext.getBean("otoyol", Otoyol.class);
        otoyol1.setAd("E-222");
        otoyol1.setUzunluk(120.0);
        otoyol1.setAzamiHiz(70);
        otoyol1.setOrtalamaHiz(55.0);
        otoyol1.setAsgariGenislik(70.0);
        otoyol1.setAzamiGenislik(12.0);
        otoyol1.setEgim(-7.0);
        System.out.println(otoyol1);

    }
}
