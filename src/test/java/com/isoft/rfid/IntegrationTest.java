package com.isoft.rfid;

import com.isoft.rfid.RfidRevampLiveApp;
import com.isoft.rfid.config.AsyncSyncConfiguration;
import com.isoft.rfid.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RfidRevampLiveApp.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
