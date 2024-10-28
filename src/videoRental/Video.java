package videoRental;

public class Video {
	private String videoName;
	private boolean checkOut;
	private int rating;

	public Video(String name) {
		this.videoName = name;
	}

	public String getName() {
		return this.videoName;
	}

	public void doCheckout() {
		if (checkOut == true) {
			System.out.println("You are already checked out!");
		} else {
			checkOut = true;
			System.out.println("You are sucessfully checked out " + videoName);
		}
	}

	public void doReturn() {
		if (checkOut == false) {
			System.out.println("You dont check out the video");
		} else {
			System.out.println("You are sucessfully returned " + videoName);
			checkOut = false;
		}

	}

	public void receiveRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return this.rating;
	}

	public boolean getCheckout() {
		return this.checkOut;
	}
}
