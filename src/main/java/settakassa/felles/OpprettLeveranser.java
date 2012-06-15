package settakassa.felles;

import settakassa.core.EntityId;
import settakassa.core.MakroExecutable;
import settakassa.domene.Fil;
import settakassa.domene.Leveranse;

/**
 * Design kommentar: Her kunne vi lagt Leveranser på grid. Vi har heller valgt å håndtere Innsendig-Fil-Leveranse som
 * ett aggregat som populeres i de første stegene. <br>
 * (I dagens kode benyttes SaldoRenteXMLReader til å hente ut leveranse XML og populere LeveranseData)
 */
public class OpprettLeveranser extends MakroExecutable<Fil> {

    public void execute(Fil fil) {
        if (fil.erGyldig()) {
            fil.leveranser.add(new Leveranse(new EntityId<Integer>(1), fil.oppgavetype));
        }
    }

}
