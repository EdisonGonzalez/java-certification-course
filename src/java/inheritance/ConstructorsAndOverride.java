package inheritance;

import java.util.ArrayList;
import java.util.List;

public class ConstructorsAndOverride {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(String.join(",", obj.type, obj.pages + ""));
    }

    static class Document {
        int pages;
        Document(int pages) {
            this.pages = pages;
        }

        public List<String> getList() {
            return null;
        }
    }

    static class Word extends Document {
        String type;
        Word(String type) {
            super(20); //default pages
            this.type = type;
        }

        Word(int pages, String type) {
//            super(1);
            this(type);
            super.pages = pages;
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }
    }
}
