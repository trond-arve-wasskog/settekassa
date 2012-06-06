package settakassa.saldorente.leveranse;

import settakassa.core.EntityId;
import settakassa.core.Executable;
import settakassa.core.MakroExecutable;
import settakassa.saldorente.oppgave.IdentifiserOppgaveeier;
import settakassa.saldorente.oppgave.OppgaveDublettKontroll;
import settakassa.saldorente.oppgave.OppgaveInnholdskontroll;
import settakassa.saldorente.oppgave.OppgaveSannsynlighetskontroll;
import settakassa.saldorente.repository.LeveranseRepository;

public class Oppgavekontroll implements Executable {
   private MakroExecutable makroExecutable = new MakroExecutable();

   public Oppgavekontroll() {
      makroExecutable.add(new IdentifiserOppgaveeier());
      makroExecutable.add(new OppgaveInnholdskontroll());
      makroExecutable.add(new OppgaveDublettKontroll());
      makroExecutable.add(new OppgaveSannsynlighetskontroll());
   }

   public void execute(EntityId leveranseId) {
      Iterable<EntityId> oppgaveIDer = LeveranseRepository.hentOppgaveIDer(leveranseId);
      for (EntityId oppgaveId : oppgaveIDer) {
         makroExecutable.execute(oppgaveId);
      }
   }
}
