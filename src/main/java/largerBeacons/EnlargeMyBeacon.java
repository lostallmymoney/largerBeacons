package largerBeacons;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnlargeMyBeacon implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "largerbeacons_lostallmymoney";
    public static final String MOD_NAME = "LargerBeacons";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Vanilla beacons are too small !!");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}