public class ModifyEpsilonAction implements Action {

    @Override
    public void execute(Configuration config, String string) {
        try{
            config.epsilon = Double.parseDouble(string);
        }catch (NumberFormatException e){
            System.out.println("Argument "+string+" is not a double");
        }
    }

    @Override
    public void execute(Configuration config) {

    }
}
