package settakassa.core;

/**
 * En Executable har ansvaret for å kjøre et steg i en prosess. <br>
 * 
 * @param <T> context Generelt object som prosess steget eksekverer på. <br>
 *            Eksempel: Innsending, Leveranse, LeveranseId, OppgaveId <br>
 *            Mer at på grid bør objektet være en nøkkel som prosesssteget benytter til å gjøre oppslag i et repository.
 */
public interface Executable<T> {
    JobbInfo execute(T context);
}
