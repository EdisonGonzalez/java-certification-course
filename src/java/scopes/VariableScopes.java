package scopes;

public class VariableScopes {

    private static final String scopeVariable = "This is a class scope variable";

    public static void main(String[] args) {
        Integer scopeVariable = (scopeVariable = (scopeVariable = VariableScopes.scopeVariable.length()));
//        Integer scopeVariable = scopeVariable = scopeVariable = VariableScopes.scopeVariable.length(); this is also valid
        System.out.println(scopeVariable);
        System.out.println(VariableScopes.scopeVariable);
    }
}
