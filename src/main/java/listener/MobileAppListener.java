package listener;

import com.example.entity.Event;
/**

 A {@code Listener} implementation that sends push notifications to a mobile app.

 It uses the username of the user as the recipient of the notification.
 */

public record MobileAppListener(String username) implements Listener {
    /**

     Notifies the user about the given {@code eventType} by sending a push notification to their mobile app.
     @param eventType the event type that triggered the notification
     */
    @Override
    public void update(Event eventType) {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }

}