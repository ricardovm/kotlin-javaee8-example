package com.linkhos.kotlinjavaee8;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@ApplicationPath("api")
public class JAXRSConfiguration extends Application {

    static {
        var is = JAXRSConfiguration.class.getResourceAsStream("/banner.txt");

        if (is != null) {
            try (var isr = new InputStreamReader(is);
                 var br = new BufferedReader(isr)) {
                var banner = br.lines().collect(Collectors.joining("\n", "\n", "\n"));

                Logger.getAnonymousLogger().info(banner);
            } catch (IOException e) {
                Logger.getAnonymousLogger().log(Level.FINE, "Error reading banner.txt", e);
            }
        }
    }
}
