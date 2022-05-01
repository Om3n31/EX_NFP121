public class ModifyModeSetCreuseAction implements Action {
    @Override
    public void execute(Configuration config, String string) {

    }

    @Override
    public void execute(Configuration config) {
        config.mode = Mode.CREUSE;
    }
}
