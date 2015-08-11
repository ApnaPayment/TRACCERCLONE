/**
 * 
 */
package org.traccar;

import org.traccar.helper.DistanceCalculator;
import org.traccar.helper.Log;
import org.traccar.model.Position;

/**
 * <p>
 *  ODOMeter handler
 * </p>
 * @author Amila Silva
 *
 */
public class ODOMeterHandler extends BaseDataHandler {

	public ODOMeterHandler() {
		Log.info("System based ODO meter calculation enabled for all devices");
	}

	private Position getLastPosition(long deviceId) {
		if (Context.getConnectionManager() != null) {
			return Context.getConnectionManager().getLastPosition(deviceId);
		}
		return null;
	}

	private Position calculateDistance(Position position) {
		Position last = getLastPosition(position.getDeviceId());
		if (last != null) {
			double distance = DistanceCalculator.distance(
					position.getLatitude(), position.getLongitude(),
					last.getLatitude(), last.getLongitude());
			distance = Math.round((distance) * 100.0) / 100.0;
			double odoMeter = distance + position.getOdoMeter();
			Log.info("::: Device Course : " + position.getDeviceId()
					+ ", Distance :" + distance + "m, ODO Meter :" + odoMeter + " m");
			position.setOdoMeter(odoMeter);
		} 
		return position;
	}

	private void speedInKmH(Position position) {
		position.setSpeed(position.getSpeed() * 1.852);
	}

	@Override
	protected Position handlePosition(Position position) {
		speedInKmH(position);
		return calculateDistance(position);
	}

}
