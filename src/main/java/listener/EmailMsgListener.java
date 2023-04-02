/**

 The EmailMsgListener class represents a listener that sends an email message
 to a specific email address when it receives an update about a specific event.
 */
package listener;
import com.example.entity.Event;

public record EmailMsgListener(String email) implements Listener {
    /**
     * Updates the listener with a specific event type and sends an email to the
     * specified email address concerning the event.
     *
     * @param eventType the type of the event that occurred
     */
    @Override
    public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }

}