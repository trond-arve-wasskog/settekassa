package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Innsending;

public class Filkontroll implements Executable<Innsending> {

    public JobbInfo execute(Innsending innsending) {
        innsending.kontrollerFiler();
        return new JobbInfo();
    }

}
