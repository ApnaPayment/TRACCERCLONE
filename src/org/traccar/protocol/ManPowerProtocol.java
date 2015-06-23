package org.traccar.protocol;

import org.traccar.BaseProtocol;
import org.traccar.http.commands.CommandType;
import org.traccar.protocol.commands.CommandTemplate;

import java.util.Map;

public class ManPowerProtocol extends BaseProtocol {

    public ManPowerProtocol() {
        super("manpower");
    }

    @Override
    protected void loadCommandTemplates(Map<CommandType, CommandTemplate> templates) {
        
    }
}
