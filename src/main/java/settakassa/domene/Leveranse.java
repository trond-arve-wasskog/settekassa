package settakassa.domene;

import settakassa.core.EntityId;

public class Leveranse {

    private EntityId<Integer> id;// UUID
    private String oppgavetype;

    public Leveranse(EntityId<Integer> id, String oppgavetype) {
        this.id = id;
        this.oppgavetype = oppgavetype;
    }

    public String getOppgavegiverOrgansisasjonsnummer() {
        return "981628736";
    }

    public void setOppgavegiverPartsnummer(Long partsnummer) {
        // TODO Auto-generated method stub
    }

    public EntityId<Integer> getId() {
        return id;
    }

    public String getOppgavetype() {
        return oppgavetype;
    }

    public LeveranseId getLeveranseId() {
        return new LeveranseId(id.getVerdi());
    }
}
