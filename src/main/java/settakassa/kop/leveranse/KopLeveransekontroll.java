package settakassa.kop.leveranse;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Innsending;

public class KopLeveransekontroll implements Executable<Innsending> {
    public JobbInfo execute(Innsending innsending) {
        return new JobbInfo();
    }

}
