package me.vsadokhin.iot.statistics.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

@SpringBootApplication(exclude = CassandraDataAutoConfiguration.class)
public class StatisticsApplication {

    public static void main(String... args) {
   		SpringApplication.run(StatisticsApplication.class, args);
   	}
   	
}