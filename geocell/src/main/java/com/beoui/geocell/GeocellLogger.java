package com.beoui.geocell;

import org.apache.log4j.Logger;

public final class GeocellLogger extends Logger {
	private static final String FQCN = "com.beoui.geocell";

	public GeocellLogger( String name ) {
		super( FQCN + "." + name );
	}

	public static Logger get( Class cls ) {
        return Logger.getLogger( cls.getName() );
    }

}
