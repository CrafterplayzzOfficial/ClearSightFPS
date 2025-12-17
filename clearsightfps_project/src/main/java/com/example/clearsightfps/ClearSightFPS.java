package com.example.clearsightfps;

import com.example.clearsightfps.client.CrosshairRenderer;
import net.fabricmc.api.ClientModInitializer;

public class ClearSightFPS implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CrosshairRenderer.init();
    }
}
