package rhyhe.rhyhetweaks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RhyheTweaks implements ModInitializer {
    public static final String MOD_ID = "rhyhetweaks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

		ModRecipes.initialize();
		ModItems.initialize();

		LOGGER.info("Rhyhe's Tweaks initialized.");
	}
}
