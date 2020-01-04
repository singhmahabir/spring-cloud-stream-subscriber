/**
 *
 */
package singh.mahabir.subscriber;

import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

/**
 * Retrieve the messages from broker using spring integration
 * {@link @ServiceActivator}
 *
 * @author Mahabir Singh
 *
 */

//@EnableBinding(Sink.class)
@Slf4j
public class StreamSubscriber {

    /**
     * 2nd way using {@link ServiceActivator}
     *
     * @param msg Message published by producer
     */
//    @ServiceActivator(inputChannel = Sink.INPUT)
    public void serviceActivatorWay(String msg) {
	log.info("slow = {}", msg);
    }
}
