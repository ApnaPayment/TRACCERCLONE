package org.traccar.protocol;

import org.traccar.BaseProtocol;
import org.traccar.http.commands.CommandType;
import org.traccar.protocol.commands.CommandTemplate;

import java.util.Map;

public class TytanProtocol extends BaseProtocol {

    public TytanProtocol() {
        super("tytan");
    }

    @Override
    protected void loadCommandTemplates(Map<CommandType, CommandTemplate> templates) {
        
    }
}
