package io.pallas.coreexample;

import io.pallas.core.WebApplication;
import io.pallas.core.annotations.Application;

/**
 *
 * @author
 *
 */
@Application
public class ExampleApplication extends WebApplication {

	@Override
	public String getName() {

		return "example";
	}
}
