package me.partlysunny;

import net.hypixel.api.HypixelAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.UUID;

public class Main {

    public static HypixelAPI api;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Main.class.getResourceAsStream("/apikey.txt"))));
        String key = reader.readLine();
        UUID id = UUID.fromString(key);
        api = new HypixelAPI(id);
        System.out.println(ItemInfoRetriever.isCraftable("aatrox_batphone"));
    }
}
