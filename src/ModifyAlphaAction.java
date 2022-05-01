public class ModifyAlphaAction implements Action {
    @Override
    public void execute(Configuration config, String arg) {
        try{
            config.alpha = Double.parseDouble(arg);
        }catch (NumberFormatException e){
            System.out.println("Argument "+arg+" is not a double");
        }
    }

    @Override
    public void execute(Configuration config) {

    }
}
