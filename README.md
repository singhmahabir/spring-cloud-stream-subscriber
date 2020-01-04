# spring-cloud-stream-subscriber
spring-cloud-stream-subscriber consumes data from rabbitmq and kafka

> More options for consuming Messages

    -   Using Spring Integration's ServiceActivator
    -   Set ``Condition`` on @Streamlistener to dispatch to different methods
    -   leverage @SendTo if consuming and republishing 
    
> Using consumer group to scale 

    -   spring.cloud.stream.bindings.<channelname>.group=tollProcessingGroup
    -   spring.cloud.stream.bindings.input.group=tollProcessingGroup
    
> Stateful processing  with partitions

    -   spring.cloud.stream.bindings.input.consumer.partitioned=true
    -   spring.cloud.stream.instanceIndex=0
    -   spring.cloud.stream.instanceCount=3
    
> content type

    -   spring.cloud.stream.default.contentType=application/json
    -   from version 2.0.0 this is not required it happened automatically
    
#### Some useful url

> -   https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/
> -   https://github.com/spring-cloud/spring-cloud-stream-samples   