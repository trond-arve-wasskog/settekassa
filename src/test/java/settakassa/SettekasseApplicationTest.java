package settakassa;

import org.junit.Test;

import settakassa.aku.AkuProsess;
import settakassa.core.SettekasseApplication;
import settakassa.saldorente.SaldoRenteProsess;

public class SettekasseApplicationTest {

    @Test
    public void skalProssessereEnSaldoRenteLeveranse() {
        // En leveranse ligger på griden. Denne skal prossesseres...
        SettekasseApplication settekasseApplication = new SettekasseApplication(new SaldoRenteProsess());
        settekasseApplication.prosesserLeveranser();
    }

    @Test
    public void skalProsessereEnAkuLeveranse() {
        SettekasseApplication settekasseApplication = new SettekasseApplication(new AkuProsess());
        settekasseApplication.prosesserLeveranser();
    }

}
