public class PageRank {
    public static void main(String... args) {
        args = "-K 21 -E .001 -K 100".split(" ");

        //EXERCICE 3
        CLIModulaire cli = new CLIModulaire();
        cli.addOption("-K",  "Test", new ModifyIndiceAction());
        cli.addOption("-A", "Test", new ModifyAlphaAction());
        cli.addOption("-E", "Test", new ModifyEpsilonAction());
        cli.addOption("-P", "Test", new ModifyModeSetPleineAction());

        cli.configuration(args);

        //EXERCICE 5
        CLIModulaire cliMod = CLIUtils.fromClass(new Configuration());
    }
}
