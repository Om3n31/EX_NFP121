public class ModifyAlphaAction extends ABActionConfiguration {

    ModifyAlphaAction(Configuration configuration){
        this.configuration = configuration;
    }
     protected void modifyConfiguration(Object object){
        try{
            configuration.alpha = Double.parseDouble((String) object);
        }catch (NumberFormatException e){
            System.out.println("Argument "+object+" is not a double");
        }
    }
    @Override
    public void execute(Object object) {
       this.modifyConfiguration(object);
    }
}
