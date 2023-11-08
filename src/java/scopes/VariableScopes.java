package scopes;

public class VariableScopes {

    private static final String scopeVariable = "This is a class scope variable";

    public static void main(String[] args) {
        final var methodVariable = new VariableScopes();
        Integer scopeVariable = (scopeVariable = (scopeVariable = VariableScopes.scopeVariable.length()));
//        Integer scopeVariable = scopeVariable = scopeVariable = VariableScopes.scopeVariable.length(); this is also valid
        System.out.println(scopeVariable);
        System.out.println(VariableScopes.scopeVariable);
        System.out.println(methodVariable.scopeVariable); //this can be done but is not recommended
    }
}