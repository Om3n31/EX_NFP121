public class ModifyModeSetPleineAction implements Action {
    @Override
    public void execute(Configuration config, String string) {

    }

    @Override
    public void execute(Configuration config) {
        config.mode = Mode.PLEINE;
    }
}
