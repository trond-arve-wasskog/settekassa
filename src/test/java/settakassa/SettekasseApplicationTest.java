package settakassa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import settakassa.aku.AkuProsess;
import settakassa.core.JobbInfo;
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

        JobbInfo jobbInfo = settekasseApplication.prosesserLeveranser();
        assertTrue(jobbInfo.erKjortOK());

    }

    @Test
    public void skalProsessereEnAkuLeveranse() {
        SettekasseApplication settekasseApplication = new SettekasseApplication(new AkuProsess());
        JobbInfo jobbInfo = settekasseApplication.prosesserLeveranser();
        assertTrue(jobbInfo.erKjortOK());
    }

}
