/*
	author: Ariya Rasekh <ariya.rasekh@gmail.com>
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main{


	public static void main(String[] args) {
		boolean flag = true;
		int choice;

		Item[] i = new Item[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to inventory Please Choose from following options");
		while (flag) {
			System.out.println("1- adding items to inventory");
			System.out.println("2- Display all items.");
			System.out.println("3- Display only books sorted by author name.");
			System.out.println("4- Display only gifts sorted by label.");
			System.out.println("5- Display only shoes sorted by size");
			System.out.println("6- Delete an item by item_id");
			System.out.println("7- Purchase an item");
			System.out.println("-1 to exit");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:

					System.out.println("please enter the name of Items you want to have");
					System.out.println("available items are Book, Gift Card, Shoe: ");

					String in;
					in = sc.nextLine();

					if (in.equalsIgnoreCase("shoe")) {
						System.out.println("Please choose colour: ");
						String c;
						c = sc.nextLine();
						System.out.println("Please enter the size: ");
						double s;
						s = sc.nextDouble();
						System.out.println("Please enter the quantity: ");
						int q;
						q= sc.nextInt();
						System.out.println("Please Enter Title: ");
						String tit;
						tit= sc.nextLine();
						System.out.println("Please enter the price: ");
						double pr;
						pr = sc.nextDouble();
						i[0] = new Shoe(c, s,tit,q,pr);
						i[0].Display();
					}
					else if (in.equalsIgnoreCase("GiftCard")) {
						System.out.println("Please Enter the label: ");
						String l;
						l = sc.nextLine();
						System.out.println("Please Enter manufacturer: ");
						String m;
						m = sc.nextLine();
						System.out.println("Please enter the quantity: ");
						int q;
						q= sc.nextInt();
						System.out.println("Please Enter Title: ");
						String tit;
						tit= sc.nextLine();
						System.out.println("Please enter the price: ");
						double pr;
						pr = sc.nextDouble();
						i[0] = new GiftCard(l, m,tit,q,pr);
						i[0].Display();
					}
					else if (in.equalsIgnoreCase("Book")) {
						System.out.println("Please Enter the book's title: ");
						String a;
						a = sc.nextLine();
						System.out.println("Please Enter the year: ");
						int y;
						y = sc.nextInt();
						System.out.print("Please Enter the author: ");
						sc.nextLine();
						String g;
						g = sc.nextLine();
						System.out.println("Please enter the quantity: ");
						int q;
						q= sc.nextInt();
						sc.nextLine();
						System.out.println("Please Enter Title: ");
						String tit;
						tit= sc.nextLine();
						System.out.println("Please enter the price: ");
						double pr;
						pr = sc.nextDouble();
						i[0] = new Book(g, a, y,tit,q,pr);
						i[0].Display();
					}
					else {
						System.out.println("invalid input!!");
					}
					break;

				case 2:
					for(int j=0;j<100;j++){
						i[j].Display();
						if(i[j].getQuantity()==0) {
							break;
						}
					}
					break;
				case 3:
					System.out.println(i[1].author);
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case -1:
					System.out.println("Exiting...");
					flag=false;
					break;
				default:
					System.out.println("invalid input");




				}
			}
		}
	}
