package settekassa;

import org.junit.Test;

import settakassa.saldorente.SaldoRenteProsess;
import settekassa.aku.AkuProsess;
import settekassa.core.SettekasseApplication;

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
