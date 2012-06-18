package settakassa.core;

public class JobbInfo {

    private boolean erKjortOK = true;

    public void addBeforeEvent(EntityId id) {
    }

    public void addAfterEvent(EntityId id) {
    }

    public boolean erKjortOK() {
        return erKjortOK;
    }

    public void setErKjortOK(boolean erKjortOK) {
        this.erKjortOK = erKjortOK;
    }

    public JobbInfo aggreger(JobbInfo jobbInfo2) {
        this.erKjortOK = this.erKjortOK && jobbInfo2.erKjortOK();
        return this;
    }

}
