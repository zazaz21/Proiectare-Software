/**
 * The listener package contains the {@link Listener} interface, which defines the contract for classes
 * that want to listen to events. It also contains various classes that implement the {@link Listener}
 * interface for specific event types.
 *
 * <p>The {@link Listener} interface has a single method, {@link Listener#update(Event)}, which is called
 * by the {@link NotificationService} when an event occurs. Classes that implement the {@link Listener}
 * interface can define their own behavior for handling events.</p>
 *
 * <p>The other classes in this package are implementations of the {@link Listener} interface for specific
 * event types. For example, the {@link EmailMsgListener} class is an implementation of {@link Listener}
 * that sends an email message when an event occurs.</p>
 *

 */
package listener;

import com.example.entity.Event;

public interface Listener {

    void update(Event eventType);

}