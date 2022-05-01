import java.lang.reflect.Field;

public class CLIUtils {
    //from classe, ici configuration
    public static CLIModulaire fromClass(Class objet){
        CLIModulaire cli = new CLIModulaire();
        Field[] fields = objet.getDeclaredFields();
        for (Field field: fields) {
            if(field.getType() == Boolean.class){
                String flag = getFlag(field);
                String flagAtFalse = "-"+Character.toUpperCase(flag.charAt(1));

                cli.addOption(flag, new Option(
                        flag,
                        "Positionner "+field.getName()+" à vrai."
                ));

                cli.addOption(flagAtFalse, new Option(
                        flagAtFalse,
                        "Positionner "+field.getName()+" à faux."
                ));
            }else{
                cli.addOption(getFlag(field),normalAttribute(field));
            }
        }
        return cli;
    }
    private static Option normalAttribute(Field field){
        String fieldName = field.getName();
        Option option = new Option("-"+fieldName.charAt(0), "Value of "+fieldName);
        return option;
    }
    private static String getFlag(Field field){
        return "-"+field.getName().charAt(0);
    }
}
