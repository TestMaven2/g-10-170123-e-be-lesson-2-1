package app;

public class HelloWorld {

    public void init() {
        System.out.println("Init method - " + this.getClass().getSimpleName());
    }

    public void destroy() {
        System.out.println("Destroy method - " + this.getClass().getSimpleName());
    }
}