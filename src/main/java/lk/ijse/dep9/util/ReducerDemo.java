package lk.ijse.dep9.util;

import java.util.ArrayList;

public class ReducerDemo {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("{");
        lines.add("type:transfer,");
        lines.add("account:123-123");
        lines.add("}");

        System.out.println(lines.stream().reduce("", (p, c) -> p+c));
    }
}
