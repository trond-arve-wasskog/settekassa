package settakassa.core;

public class SettekasseApplication {
    private Executable<Void> prosess;

    public SettekasseApplication(Executable<Void> prosess) {
        this.prosess = prosess;
    }

    public JobbInfo prosesserLeveranser() {
        System.out.println("Start prosess");
        return prosess.execute(null);
    }

}
