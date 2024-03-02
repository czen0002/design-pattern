package FactoryMethod;

public class Application {
  private static Dialog dialog;
  
  public static void main(String[] args) {
    String os = "";
    
    if (args.length < 1) {
      System.out.println("Please provide os");
    } else {
      os = args[0].toLowerCase();
    }
    
    switch (os) {
      case "windows":
        dialog = new WindowsDialog();
        break;
      case "mac":
        dialog = new MacDialog();
        break;
      default:
      System.exit(0);
        break;
    }

    dialog.renderDialog();
  }
}