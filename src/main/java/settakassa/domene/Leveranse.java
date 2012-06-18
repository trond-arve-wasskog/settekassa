package settakassa.domene;

import java.util.UUID;

public class Leveranse {

    private UUID id = UUID.randomUUID();
    private String oppgavetype;

    public Leveranse(String oppgavetype) {
        this.oppgavetype = oppgavetype;
    }

    public String getOppgavegiverOrgansisasjonsnummer() {
        return "981628736";
    }

    public void setOppgavegiverPartsnummer(Long partsnummer) {
        // TODO Auto-generated method stub
    }

    public String getOppgavetype() {
        return oppgavetype;
    }

    public LeveranseId getLeveranseId() {
        return new LeveranseId(id);
    }
}
