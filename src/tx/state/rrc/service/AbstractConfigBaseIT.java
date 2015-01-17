package us.tx.state.rrc.service;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import us.tx.state.rrc.config.AppConfig;

/**
 * Base configuration for test classes. Configures the Spring context.
 * 
 * @author AytulY
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy (value = { 
		@ContextConfiguration(classes = { AppConfig.class })
})
@Transactional
public abstract class AbstractConfigBaseIT {
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractConfigBaseIT.class);


}