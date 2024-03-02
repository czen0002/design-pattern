package FactoryMethod;

public abstract class Dialog {
  public abstract Button createButton();
  public void renderDialog() {
    Button button = createButton();
    button.render();
    System.out.println("Render dialog");
  };
}
