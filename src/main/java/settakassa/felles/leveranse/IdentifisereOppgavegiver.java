package settakassa.felles.leveranse;

import settakassa.core.Executable;
import settakassa.domene.Leveranse;
import settakassa.domene.LeveranseId;
import settakassa.saldorente.repository.LeveranseRepository;
import settakassa.service.PartService;

/**
 * Bør kunne være generell MEN! For AKU er innsender og oppgavegiver den samme. For eksempel: Svenske skattemyndighet
 * Innsender/Oppgavegiver velges i skjermbildet.Dette steget skal derfor ikke gjøres for AKU.
 */
public class IdentifisereOppgavegiver implements Executable<LeveranseId> {

    PartService partService = new PartService();

    public void execute(LeveranseId leveranseId) {
        System.out.println(String.format("Identifiserer oppgavegiver for leveranse med id %s", leveranseId));
        // i eksisterende kode gjøres identifisering i InnsendingServiceBean.settLeveransedata for SaldoRente
        // for AKU er innsender og oppgavegiver den samme...
        identifiserOppgavegiver(leveranseId);
    }

    private void identifiserOppgavegiver(LeveranseId leveranseId) {
        Leveranse leveranse = LeveranseRepository.LEVERANSER.get(leveranseId);
        Long partsnummer = partService.hentPartsnummerForOrganisasjonsnummer(leveranse.getOppgavegiverOrgansisasjonsnummer());
        leveranse.setOppgavegiverPartsnummer(partsnummer);
    }

}
