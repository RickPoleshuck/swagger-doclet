package com.tenxerconsulting.swagger.doclet.sample;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * The JaxRsApplication represents
 * @version $Id$
 * @author conor.roche
 */
public class JaxRsApplication extends ResourceConfig {

	@SuppressWarnings("javadoc")
	public JaxRsApplication() {

		super(
		// register resources
				SimpleResource.class, BeanParamResource.class,
				// register Jackson ObjectMapper resolver
				MyObjectMapperProvider.class, JacksonFeature.class);

	}
}
