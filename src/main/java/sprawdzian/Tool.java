package sprawdzian;

public class Tool {
    String type;

    public Tool(String type) {
        this.type = type;
    }

    public void useTool(){
        System.out.println("używam narzędzia: " + type);

    }
}
