public class PageRank {
    public static void main(String... args) {

        //EXERCICE 3
        CLIModulaire cli = new CLIModulaire();
        cli.addOption("-K",  "Test", true, new ModifyIndiceAction(cli.config));
        cli.addOption("-A", "Test", true, new ModifyAlphaAction(cli.config));
        cli.addOption("-E", "Test", true, new ModifyEpsilonAction(cli.config));
        cli.addOption("-P", "Test", false, new ModifyModeSetPleineAction(cli.config));

        cli.configuration(args);

        //EXERCICE 5
        CLIModulaire cliMod = CLIUtils.fromClass(new Configuration());
    }
}
