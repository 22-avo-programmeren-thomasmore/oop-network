import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    
    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }

    /**
     * Add a text post to the news feed.
     * 
     * @param text  The text post to be added.
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Add a photo post to the news feed.
     * 
     * @param photo  The photo post to be added.
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        // display all text posts
        messages.forEach(message -> {
            message.display();
            System.out.println();   // empty line between posts
        });

        // display all photos
        photos.forEach(photo -> {
            photo.display();
            System.out.println();   // empty line between posts
        });
    }
    
    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();
        MessagePost mp = new MessagePost("wim", "knap werk!");
        mp.addComment("toch niet helemaal akkoord...");
        mp.like();
        mp.like();
        nf.addMessagePost(mp);
        nf.addMessagePost(new MessagePost("betty", "wanneer komen er video's?"));
        nf.addPhotoPost(new PhotoPost("betty", "vakantie.jpg", "Op vakantie!"));
        PhotoPost pp = new PhotoPost("betty", "ardennen.jpg", "een dagje erop uit");
        nf.show();
    }
}
