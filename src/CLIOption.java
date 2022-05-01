public class CLIOption extends Option{

    CLIOption(String accès, String description) {
        super(accès, description);
    }

    CLIOption(String accès, String description, Action action) {
        super(accès, description, action);
    }

    @Override
    public void executer() {

    }

    @Override
    public void executer(Configuration config) {

    }

    @Override
    public void executer(Configuration config, String str) {

    }
}
