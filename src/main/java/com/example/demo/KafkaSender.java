package com.example.demo;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

@Slf4j
public class KafkaSender {

  public void sendMessage() {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    String topic = "tgk.ml.ipsprint";

    KafkaProducer<String, String> producer = new KafkaProducer<>(props);
    String value = "your_message";

    ProducerRecord<String, String> record = new ProducerRecord<>(topic, value);
    log.info("Record to send is {}", record);
    log.info("Topic to send is {}", topic);
    /*producer.send(record, (recordMetadata, exception) -> {
      if (exception != null) {
        exception.printStackTrace();
      } else {
        System.out.println(
          "Message sent to topic " + recordMetadata.topic() + " partition " + recordMetadata.partition() + " with offset " +
            recordMetadata.offset());
      }
    });
    producer.close();
*/
  }

}
