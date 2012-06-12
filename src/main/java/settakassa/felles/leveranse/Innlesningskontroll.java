package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.felles.fil.LastOppLeveranse;

public class Innlesningskontroll extends MakroExecutable {

    public Innlesningskontroll() {
        add(new LastOppLeveranse());
    }

}
