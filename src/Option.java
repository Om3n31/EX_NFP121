public class Option implements OptionInterface {
    private String accès;
    private String description;
    private Action action;

    private Boolean takesValues;
    Option(String accès, String description, Action action){
        this.takesValues = false;
        setAccès(accès);
        setDescription(description);
        this.action = action;
    }

    public String getAccès() {
        return accès;
    }
    public void setAccès(String accès) {
        this.accès = accès;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean takesValue() {
        return takesValues;
    }

    public void setAction(Action action){
        this.action = action;
    }

    @Override
    public void executer() {
    }

    @Override
    public void executer(Configuration config) {
        action.execute(config);
    }

    @Override
    public void executer(Configuration config, String str) {
        action.execute(config, str);
    }
}
