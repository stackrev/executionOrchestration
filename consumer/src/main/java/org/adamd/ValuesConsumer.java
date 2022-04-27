package org.adamd;

import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class ValuesConsumer {

  @Autowired
  @Lazy
  private EurekaClient eurekaClient;

  @Bean
  public Consumer<String> onReceive() {
    return (message) -> {
      log.info( String.format(
              "Hello from '%s'!", eurekaClient.getApplication("SPRING-CLOUD-EUREKA-CLIENT").getName()));
    };
  }
}