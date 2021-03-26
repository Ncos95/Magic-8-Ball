public class Magic8 {

  public static void main(String[] args) {
    int choice = (int) (Math.random() * 9 + 1); 
      
    switch (choice) {
        
        case 1:
        System.out.println("It is certain.");
        break;

        case 2:
        System.out.println("It is decidedly so.");
        break;

        case 3:
        System.out.println("Without a doubt.");
        break;

        case 4:
        System.out.println("Ask again later.");
        break;

        case 5:
        System.out.println("Cannot predict now.");
        break;

        case 6:
        System.out.println("Concentrate and ask again.");
        break;

        case 7:
        System.out.println("My reply is no.");
        break;

        case 8:
        System.out.println("Outlook not so good.");
        break;

        case 9:
        System.out.println("Very doubtful.");
        break;

        default:
        System.out.println("An error has occured. Please try again.");
    };
  };
};