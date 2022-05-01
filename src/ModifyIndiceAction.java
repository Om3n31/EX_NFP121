public class ModifyIndiceAction implements Action {
    @Override
    public void execute(Configuration config, String string) {
        try{
            config.indice = Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.println("Argument "+string+" is not an integer");
        }
    }

    @Override
    public void execute(Configuration config) {

    }
}
