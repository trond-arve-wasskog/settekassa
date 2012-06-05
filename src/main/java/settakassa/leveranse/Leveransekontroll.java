package settakassa.leveranse;

import settakassa.core.MakroExecutable;

public class Leveransekontroll extends MakroExecutable {
	public Leveransekontroll() {
		add(new LeveranseInnholdskontroll());
		add(new LeveranseSannsynlighetskontroll());
		add(new LeveranseKvalitetskontroll());
	}
}
