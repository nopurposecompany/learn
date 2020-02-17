public interface InterfaceFuncional {
    int miMetodo(int x, int y);
}

public class Funcional {

    public static void main(final String[] args) {
        InterfaceFuncional myInterfaceFuncional = (x, y) -> 5 + 6;
        System.out.println("El resúltado es:\n"+myInterfaceFuncional);

    }
}