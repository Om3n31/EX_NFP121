public class ModifyEpsilonAction extends ABActionConfiguration {

    ModifyEpsilonAction(Configuration configuration){
        this.configuration = configuration;
    }
    protected void modifyConfiguration(Object object){
        try{
            configuration.epsilon = Double.parseDouble((String) object);
        }catch (NumberFormatException e){
            System.out.println("Argument "+object+" is not a double");
        }
    }
    @Override
    public void execute(Object object) {
        this.modifyConfiguration(object);
    }
}
