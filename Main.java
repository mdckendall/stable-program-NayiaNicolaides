import java.lang.reflect.Array;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Ask the user here
	  Stable s = new Stable();
		System.out.println("What is the address of the stable?");
		Scanner scanner = new Scanner(System.in);
		s.address = scanner.nextLine();
		do {
			System.out.println("Do you wish to add a horse to the stable?"); 
			char input = scanner.next().charAt(0);
			scanner.nextLine();
			if(input == 'y'){
				System.out.println("What is the name of the horse?");
				String hn = scanner.nextLine();
				System.out.println("What is the weight of the horse?");
				double w = scanner.nextDouble();
				System.out.println("Enter true if the horse is tame or false if it is not.");
				boolean t = scanner.nextBoolean();
        Horse h = new Horse(hn, w, t);
				s.arraylist.add(h);
			}//testing goodest 4
			else{
				break;
			}
		}while(true);
		//Display the info here
      for(int i = 0; i < s.arraylist.size(); i ++){
        System.out.println(s.arraylist.get(i));
      }
      //System.out.println("Horse #1 Name: poof Weight: 1300.0 Tame: True");
	  }
  }

