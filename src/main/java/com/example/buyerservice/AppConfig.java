package com.example.buyerservice;

import io.micrometer.core.instrument.MeterRegistry;
import io.prometheus.client.CollectorRegistry;
//import io.prometheus.client.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.micrometer.core.instrument.Counter;

@Configuration
public class AppConfig {

   // @Bean
   // public Counter VisitCounter(CollectorRegistry registry)
   // {
   //     return Counter.build("visit_couonter_hits","counts the number of hits to this service get instance method ").register(registry);
    //}

    @Bean
    public Counter AnotherVisitCounter(MeterRegistry registry)
    {
        return Counter.builder("another_visit_counter_hits").register(registry);
    }
}
