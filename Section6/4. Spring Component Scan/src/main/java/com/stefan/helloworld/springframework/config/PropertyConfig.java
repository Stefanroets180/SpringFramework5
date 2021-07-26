package com.stefan.helloworld.springframework.config;

import com.stefan.helloworld.springframework.examplebeans.FakeDataSource;
import com.stefan.helloworld.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by jt on 6/7/17.
 */
@Configuration
public class PropertyConfig {

    @Value("${stefan@.username}")
    String user;

    @Value("${stefan@.password}")
    String password;

    @Value("${stefan@.dburl}")
    String url;

    @Value("${stefan@.jms.username}")
    String jmsUsername;

    @Value("${stefan@.jms.password}")
    String jmsPassoword;

    @Value("${stefan@.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassoword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

}
