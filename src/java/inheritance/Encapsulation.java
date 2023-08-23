package inheritance;

public class Encapsulation {
    static private final String parentPrivateVariable = "parentPrivateVariable";

    static class Parent {
        public String publicVariable = "publicVariable";
        protected String protectedVariable = "protectedVariable";
        String defaultVariable = "defaultVariable";
        private String privateVariable = "privateVariable";

        public String getPublicVariable() {
            return publicVariable;
        }

        protected String getProtectedVariable() {
            return protectedVariable;
        }

        String getDefaultVariable() {
            return defaultVariable;
        }

        private String getPrivateVariable() {
            return privateVariable;
        }
    }

    static class Child extends Parent {
        private String publicVariable = "PublicVariableMadePrivate"; //closed
        String protectedVariable = "ProtectedVariableMadeDefault"; //closed
        protected String defaultVariable = "DefaultVariableMadeProtected"; //Opened
        public String privateVariable = "PrivateVariableMadePublic"; //Opened

        //Methods can always be made more accessible (less restricted).
        //We can never override a method by restricting its access even more.

        @Override
        public String getPublicVariable() { //cannot be changed to any other encapsulation
            return publicVariable;
        }

        @Override
        public String getProtectedVariable() { //can be changed to protected or public, none other bellow
            return protectedVariable;
        }

        @Override
        protected String getDefaultVariable() { //can be changed to default, protected and public. Not private
            return defaultVariable;
        }

//        @Override
        private String getPrivateVariable() { //private method cannot be seen by child class, so it's not restricted, but
            // also note this means it cannot be overwritten.
            System.out.println(parentPrivateVariable);
            return privateVariable;
        }
    }

    public static void main(String[] args) {
        Parent s = new Child();
        System.out.println(s.protectedVariable + ":" + s.getProtectedVariable());
    }
}
