package settakassa.felles.leveranse;

import settakassa.core.MakroExecutable;
import settakassa.saldorente.leveranse.InnsenderGyldighetskontroll;

public class Innsenderkontroll extends MakroExecutable {
	public Innsenderkontroll() {
		add(new IdentifisereInnsender());
		add(new InnsenderGyldighetskontroll());
	}
}
