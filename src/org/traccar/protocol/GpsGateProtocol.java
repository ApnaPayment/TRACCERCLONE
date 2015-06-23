package org.traccar.protocol;

import org.traccar.BaseProtocol;
import org.traccar.http.commands.CommandType;
import org.traccar.protocol.commands.CommandTemplate;

import java.util.Map;

public class GpsGateProtocol extends BaseProtocol {

    public GpsGateProtocol() {
        super("gpsgate");
    }

    @Override
    protected void loadCommandTemplates(Map<CommandType, CommandTemplate> templates) {
        
    }
}
