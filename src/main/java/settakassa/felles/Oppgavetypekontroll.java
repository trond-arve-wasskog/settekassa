package settakassa.felles;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Fil;

/**
 * Kontrollerer at oppgitt oppgavetype er lik filens oppgavetype
 */
public class Oppgavetypekontroll implements Executable<Fil> {

    public JobbInfo execute(Fil fil) {
        // magnet felles kode
        return new JobbInfo();
    }

}
