import java.lang.reflect.Field;

public class CLIUtils {
    public static CLIModulaire fromClass(Object objet){
        Class objetAsClass = objet.getClass();
        CLIModulaire cli = new CLIModulaire();
        Field[] fields = objetAsClass.getDeclaredFields();
        for (Field field: fields) {
            if(field.getType() == Boolean.class){
                String flag = getFlag(field);
                String flagAtFalse = "-"+Character.toUpperCase(flag.charAt(1));

                cli.addOption(flag,"Positionner "+field.getName()+" à vrai.", false,null);
                cli.addOption(flagAtFalse,"Positionner "+field.getName()+" à faux.", false, null);

            }else{
                cli.addOption(getFlag(field),"Value of "+field.getName(), true, null);
            }
        }
        return cli;
    }
    private static String getFlag(Field field){
        return "-"+field.getName().charAt(0);
    }
}
