public class ModifyModeSetPleineAction extends ABActionConfiguration {
    ModifyModeSetPleineAction(Configuration configuration){
        this.configuration = configuration;
    }
    protected void modifyConfiguration(Object object){
        this.configuration.mode = Mode.CREUSE;
    }
    @Override
    public void execute(Object object) {
        this.modifyConfiguration(object);
    }
}
