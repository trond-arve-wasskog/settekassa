package settakassa.core;


public class SettekasseApplication {
    private Executable leveranseprosess;

    public SettekasseApplication(Executable leveranseprosess) {
        this.leveranseprosess = leveranseprosess;
    }

    public void prosesserLeveranser() {
        System.out.println(String.format("Prosesserer leveranser"));
        leveranseprosess.execute(null);
    }

}
