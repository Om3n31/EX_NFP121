import java.util.ArrayList;
import java.util.HashMap;

public class CLIModulaire {
    ArrayList<Option> optionsBis = new ArrayList<>();
    HashMap<String, Option> options = new HashMap<>();
    HashMap<Option, Action> actions = new HashMap<>();
    Configuration config;

    CLIModulaire(){
        this.config = new Configuration();
    }
    public Configuration configuration(String... args){

        if (options.isEmpty()){
            System.out.println("Please add options to the CLI");
            return null;
        }
        if (args[0].charAt(0) != '-'){
            System.out.println("Invalid input");
            return null;
        }
        Option currentOption = null;

        for(int i = 0; i < args.length; i++){
            if(isOption(args[i])){
                if(optionIsValid(args[i])){
                    currentOption = options.get(args[i]);
                    continue;
                }
                System.out.println("This option is not recognized: "+args[i]);
                return null;
            }
            if(!currentOption.takesValue()){
                actions.get(currentOption).execute(config);
            }
            else if(currentOption.takesValue()){
                try{
                    actions.get(currentOption).execute(config, args[i]);
                    //currentOption.executer(config, args[i]);
                }catch (Exception e){
                    System.out.println(e);
                }

            }
        }
        return new Configuration();
    }
    public void addOption(String accès, Option option){
        options.put(accès, option);
    }
    public void associateAction(Option option, Action action){
        actions.put(option, action);
    }
    private boolean isOption(String arg){
        return arg.charAt(0) == '-';
    }
    private boolean optionIsValid(String arg){
        return arg.length() == 2 && options.containsKey(arg.charAt(1));
    }
}
