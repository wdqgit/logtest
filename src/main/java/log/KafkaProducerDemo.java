package log;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by wdq on 2018/1/10.
 */
public class KafkaProducerDemo {


    public static void main(String[] args){
        Properties prop = new Properties();
        prop.put("key.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
        prop.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
        prop.put("bootstrap.servers", "10.50.12.45:9092");
        Producer producer = new KafkaProducer(prop);
        producer.send(new ProducerRecord("jfscLog", "aaa".getBytes()));

    }
}
