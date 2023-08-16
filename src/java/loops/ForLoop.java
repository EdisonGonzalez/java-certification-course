package loops;

public class ForLoop {

    public static void main(String[] args) {
        // having no breaking condition is the same as hardcoding true
//        for (int i = 0; true ; i++) {
        for (int i = 0; ; i++) {
            if (i == 5) {
                System.out.println("We manually break the loop when we reach the if condition");
                break;
            }
        }

        int i = 0;
        String res = null;
        for(String [] s = {"A", "B", "C", "D"};;res = String.join(".", s)) { //Line n1
            if(i++ == 0)
                continue;
            else
                break;
        }
        System.out.println(res); //Line n2
    }
}
