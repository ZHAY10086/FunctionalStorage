package com.buuz135.functionalstorage.compat.jade;

import com.buuz135.functionalstorage.block.Drawer;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class FSJadePlugin implements IWailaPlugin {
    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(DrawerComponentProvider.INSTANCE, Drawer.class);
    }

    @Override
    public void register(IWailaCommonRegistration registration) {
    }
}
