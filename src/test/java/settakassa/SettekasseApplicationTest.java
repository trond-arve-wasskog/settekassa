package settakassa;

import org.junit.Test;

import settakassa.aku.AkuProsess;
import settakassa.core.SettekasseApplication;
import settakassa.saldorente.SaldoRenteProsess;

/**
 * Design kommentar: Hvordan plugger vi på JobbInfo? Bøtte? Parameter? Arv? Static final klasse? JobbInfo jobInfo =
 * settekasseApplication.prosesserLeveranser();
 */
public class SettekasseApplicationTest {

    @Test
    public void skalProssessereEnSaldoRenteLeveranse() {
        SettekasseApplication settekasseApplication = new SettekasseApplication(new SaldoRenteProsess());
        settekasseApplication.prosesserLeveranser();
    }

    @Test
    public void skalProsessereEnAkuLeveranse() {
        SettekasseApplication settekasseApplication = new SettekasseApplication(new AkuProsess());
        settekasseApplication.prosesserLeveranser();
    }

}
