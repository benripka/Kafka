import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SampleProducer {
   public SampleProducer() {
      Properties properties = new Properties();
      properties.put("bootstrap.servers", "localhost:9092");
      properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
      properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

      ProducerRecord producerRecord = new ProducerRecord("people", "name", "ben");
      ProducerRecord producerRecord1 = new ProducerRecord("people", "name", "charles");
      ProducerRecord producerRecord2 = new ProducerRecord("people", "name", "Andrew");
      ProducerRecord producerRecord3 = new ProducerRecord("people", "name", "Giovanna");

      KafkaProducer kafkaProducer = new KafkaProducer(properties);

      kafkaProducer.send(producerRecord);
      kafkaProducer.send(producerRecord1);
      kafkaProducer.send(producerRecord2);
      kafkaProducer.send(producerRecord3);
      kafkaProducer.close();
   }
}
