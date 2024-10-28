package rentalLaucher;

import java.util.Scanner;

import videoRental.VideoStore;

public class VideoLaucher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("************WELCOME TO VIDEO RENTAL INVENTORY SYSTEM********");
		VideoStore videoStore = new VideoStore();
		while (true) {
			System.out.println("Enter Your Choice:");
			System.out.println("1.Add Videos");
			System.out.println("2.Checkout Video");
			System.out.println("3.Return Video");
			System.out.println("4.Receive Rating");
			System.out.println("5.List Inventory");
			System.out.println("6.Exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter Movie Name to Add:");
				String movieName = scanner.nextLine();
				videoStore.addVideo(movieName);
				break;
			case 2:
				System.out.println("Enter Movie Name to Checkout:");
				movieName = scanner.nextLine();
				videoStore.doCheckout(movieName);
				break;

			case 3:
				System.out.println("Enter Movie Name to return:");
				movieName = scanner.nextLine();
				videoStore.doReturn(movieName);
				break;
			case 4:
				System.out.println("Enter Movie Name to receive rating:");
				movieName = scanner.nextLine();
				int rating = scanner.nextInt();
				videoStore.receiveRating(movieName, rating);
				break;
			case 5:
				videoStore.listInventory();
				break;
			case 6:
				System.out.println("Thank you!!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid Choice!!");

			}
		}

	}
}
