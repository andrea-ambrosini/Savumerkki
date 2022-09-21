package org.rossonet.savumerkki.config.puller;

import java.net.URL;

import org.rossonet.savumerkki.config.MonitoredConfig;

public interface Puller {

	public void fire();

	public String getChannelControlValue();

	public long getConfigGeneration();

	/**
	 * @return a string the last update hash from the server
	 */
	public String getLastChannelControlValue();

	public MonitoredConfig getMonitoredConfig();

	public PullerCallback getPullerCallback();

	public URL geturl();

	/**
	 * @return true if the config need to be download just one time from the remote
	 */
	public boolean isOneTimeOnlyConfigured();

	/**
	 * @param newDelay. The method also manage the Scheduled tasks after the
	 *                  update()
	 */
	public void updateDelayMs(long newDelay);

}
