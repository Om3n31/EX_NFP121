public class Option {
    private String accès;
    private String description;
    private IAction action;

    private Boolean takesValues;
    Option(String accès, String description,Boolean takesValue, IAction action){
        this.takesValues = takesValue;
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

    public void setAction(IAction action){
        this.action = action;
    }

    public void executer(Object object) {
        this.action.execute(object);
    }
}
