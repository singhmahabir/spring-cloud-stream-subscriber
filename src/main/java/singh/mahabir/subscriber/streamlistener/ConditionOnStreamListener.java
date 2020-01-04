/**
 *
 */
package singh.mahabir.subscriber.streamlistener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

/**
 * This Class used to retrieve the messages from broker using
 * {@link StreamListener} directly or condition way
 *
 * @author Mahabir Singh
 *
 */

@EnableBinding(Sink.class)
@Slf4j
public class ConditionOnStreamListener {

    /**
     * 1st way using {@link StreamListener}
     *
     * @param msg Message published by producer
     */
//    @StreamListener(Sink.INPUT)
    public void streamListenerWay(String msg) {
	log.info("slow = {}", msg);
    }

    /**
     * 1st way using condition on {@link StreamListener}
     */

    @StreamListener(target = Sink.INPUT, condition = "headers['speed'] > 40")
    public void conditionOnStreamListenerWayFast(String msg) {
	log.info("fast = {}", msg);
    }

    @StreamListener(target = Sink.INPUT, condition = "headers['speed'] <= 40")
    public void conditionOnStreamListenerWayLow(String msg) {
	log.info("slow = " + msg);
    }
}
