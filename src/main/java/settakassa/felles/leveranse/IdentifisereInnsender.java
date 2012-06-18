package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.core.JobbInfo;
import settakassa.domene.Innsending;

public class IdentifisereInnsender implements Executable<Innsending> {
    public JobbInfo execute(Innsending innsending) {
        System.out.println(String.format("Identifiserer innsender for leveranse med id %s", innsending.id));
        // identifiserer innsender
        return new JobbInfo();
    }

}
