public class ModifyIndiceAction extends ABActionConfiguration {

    ModifyIndiceAction(Configuration configuration){
        this.configuration = configuration;
    }
    protected void modifyConfiguration(Object object){
        try{
            configuration.indice = Integer.parseInt((String) object);
        }catch (NumberFormatException e){
            System.out.println("Argument "+object+" is not an integer");
        }
    }
    @Override
    public void execute(Object object) {
        this.modifyConfiguration(object);
    }
}
