package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.domene.Innsending;

public class Filkontroll implements Executable<Innsending> {

    public void execute(Innsending innsending) {
        innsending.kontrollerFiler();
    }

}
