package com.example.instantcrystalremover;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class InstantCrystalRemoverClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("instantcrystalremover");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Instant Crystal Remover загружен. Кристаллы исчезнут сразу после удара.");
    }
}
