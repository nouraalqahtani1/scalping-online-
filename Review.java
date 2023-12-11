
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review {
   
    public String userName;
    public String itemID;
    public int rate;
    public String addComment;

    private static List<Review> reviews = new ArrayList<>();

    public Review(String userName, String itemID, int rate, String addComment) {
        this.userName = userName;
        this.itemID = itemID;
        this.rate = rate;
        this.addComment = addComment;
    }

    // Method to add a review
    public static void addReview() {
        Scanner input = new Scanner(System.in);

        System.out.println("*** ADD REVIEW ***");
        System.out.print("Enter your username: ");
        String userName = input.nextLine();
        System.out.print("Enter the item ID: ");
        String itemID = input.nextLine();

        // Check if the user has already reviewed the item
        for (Review review : reviews) {
            if (review.userName.equals(userName) && review.itemID.equals(itemID)) {
                System.out.println("You have already reviewed this item.");
                return;
            }
        }

        System.out.print("Choose a rating (1 to 5, where 1 is Very Bad and 5 is Very Good): ");
        int rate = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Add a comment (optional): ");
        String addComment = input.nextLine();

        Review newReview = new Review(userName, itemID, rate, addComment);
        reviews.add(newReview);
        System.out.println("Review added successfully!");
    }

    // Method to remove a review
    public static void removeReview() {
        Scanner input = new Scanner(System.in);

        System.out.println("*** REMOVE REVIEW ***");
        System.out.print("Enter your username: ");
        String userName = input.nextLine();
        System.out.print("Enter the item ID: ");
        String itemID = input.nextLine();

        Review foundReview = null;
        for (Review review : reviews) {
            if (review.userName.equals(userName) && review.itemID.equals(itemID)) {
                foundReview = review;
                break;
            }
        }

        if (foundReview != null) {
            reviews.remove(foundReview);
            System.out.println("Review removed successfully!");
        } else {
            System.out.println("Review not found.");
        }
    }

    // Method to edit a review
    public static void editReview() {
        Scanner input = new Scanner(System.in);

        System.out.println("*** EDIT REVIEW ***");
        System.out.print("Enter your username: ");
        String userName = input.nextLine();
        System.out.print("Enter the item ID: ");
        String itemID = input.nextLine();

        Review foundReview = null;
        for (Review review : reviews) {
            if (review.userName.equals(userName) && review.itemID.equals(itemID)) {
                foundReview = review;
                break;
            }
        }

        if (foundReview != null) {
            System.out.print("Choose a new rating (1 to 5, where 1 is Very Bad and 5 is Very Good): ");
            foundReview.rate = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Edit the comment (current comment: " + foundReview.addComment + "): ");
            foundReview.addComment = input.nextLine();

            System.out.println("Review edited successfully!");
        } else {
            System.out.println("Review not found.");
        }
    }
}
