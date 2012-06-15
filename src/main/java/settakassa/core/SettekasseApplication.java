package settakassa.core;

public class SettekasseApplication {
    private Executable<Void> prosess;

    public SettekasseApplication(Executable<Void> prosess) {
        this.prosess = prosess;
    }

    public void prosesserLeveranser() {
        System.out.println("Start prosess");
        prosess.execute(null);
    }

}
