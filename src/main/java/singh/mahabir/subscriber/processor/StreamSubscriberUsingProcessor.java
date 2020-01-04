/**
 *
 */
package singh.mahabir.subscriber.processor;

import org.springframework.cloud.stream.messaging.Processor;

import lombok.extern.slf4j.Slf4j;

/**
 * Using {@link Processor} we can either produce or retrieve the messages to or
 * from broker
 *
 * @author Mahabir Singh
 *
 */

@Slf4j
//@EnableBinding(Processor.class)
public class StreamSubscriberUsingProcessor {

    /**
     * 3rd way using {@link Processor}
     *
     * @param msg Message published by producer
     * @return Processor can return any message to any broker using @SendTo
     */
//    @StreamListener(Processor.INPUT)
//    @SendTo(Processor.OUTPUT)
    public String streamProcessorrWay(String msg) {
	log.info("slow = {}", msg);
	return msg + " via sendTo";
    }
}
