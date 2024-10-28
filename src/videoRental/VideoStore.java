package videoRental;

import java.util.ArrayList;

public class VideoStore {
	ArrayList<Video> store;

	public VideoStore() {
		store = new ArrayList<Video>();
	}

	public void addVideo(String name) {
		if (!store.isEmpty() && getVideo(name) != null) {
			System.out.println("You Have Already Added");
		} else {
			store.add(new Video(name));
		}
	}

	public Video getVideo(String name) {
		for (Video video : store) {
			if (video.getName().equalsIgnoreCase(name)) {
				return video;
			}
		}
		return null;
	}

	public void doCheckout(String name) {
		if (store.isEmpty() || getVideo(name) == null) {
			System.out.println("Video not found!");
		} else {
			getVideo(name).doCheckout();
		}
	}

	public void doReturn(String name) {
		if (store.isEmpty() || getVideo(name) == null) {
			System.out.println("Video not found!");
		} else {
			getVideo(name).doReturn();
		}
	}

	public void receiveRating(String name, int rating) {
		if (store.isEmpty() || getVideo(name) == null) {
			System.out.println("Video not found");
		} else {
			getVideo(name).receiveRating(rating);
		}
	}

	public void listInventory() {
		System.out.println("Movies: ");
		int c = 1;
		for (Video video : store) {
			System.out.println(c + " . " + video.getName() + " Rating: " + video.getRating() + " Checkout :"
					+ video.getCheckout());
		}

	}
}
