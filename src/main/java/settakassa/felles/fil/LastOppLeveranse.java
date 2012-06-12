package settakassa.felles.fil;

import settakassa.core.EntityId;
import settakassa.core.Executable;
import settakassa.domene.Leveranse;
import settakassa.domene.Oppgave;
import settakassa.saldorente.repository.LeveranseRepository;

/**
 * Generelt prosess steg? I dagens kode benyttes SaldoRenteXMLReader til å hente ut leveranse XML og populere
 * LeveranseData
 */
public class LastOppLeveranse implements Executable {
    public void execute(EntityId leveranseId) {
        System.out.println(String.format("Laster opp leveranse fil for id %s", leveranseId));
        hentUtLeveranseFraXML();
        hentUtOppgaverFraXML();
    }

    private void hentUtLeveranseFraXML() {
        // henter xml
        // parser og populerer SaldoRenteLeveranseData
        EntityId<Integer> leveranseId = new EntityId<Integer>(1);
        Leveranse leveranse = new Leveranse(leveranseId);
        LeveranseRepository.LEVERANSE.put(leveranseId, leveranse);
    }

    private void hentUtOppgaverFraXML() {
        EntityId<Integer> oppgaveId = new EntityId<Integer>(10);
        Oppgave oppgave = new Oppgave(oppgaveId);
        LeveranseRepository.OPPGAVER.put(oppgaveId, oppgave);
    }
}
