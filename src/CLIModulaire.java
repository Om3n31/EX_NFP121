import java.util.ArrayList;
import java.util.HashMap;

public class CLIModulaire {
    //J'utilise le hashmap pour faciliter l'accès à l'option
    HashMap<String, Option> options = new HashMap<>();
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
                currentOption.executer(config);
            }
            else if(currentOption.takesValue()){
                currentOption.executer(config, args[i]);
            }
        }
        return new Configuration();
    }
    public void addOption(String accès, String description, Action action){
        Option option = new Option(accès, description, action);
        options.put(accès, option);
    }

    private boolean isOption(String arg){
        return arg.charAt(0) == '-';
    }
    private boolean optionIsValid(String arg){
        return options.containsKey(arg);
    }
}
