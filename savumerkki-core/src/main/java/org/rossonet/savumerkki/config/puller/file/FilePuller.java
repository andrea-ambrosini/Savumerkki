package org.rossonet.savumerkki.config.puller.file;

import java.net.URL;

import org.rossonet.savumerkki.config.puller.AbstractPuller;

public class FilePuller extends AbstractPuller {

	private static final String FILE_PULLER_PROTOCOL = "file";

	@Override
	protected void configureFromUrl(final URL url) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getProtocol() {
		return FILE_PULLER_PROTOCOL;
	}

}
