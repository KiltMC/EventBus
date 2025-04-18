package net.minecraftforge.eventbus;

// Kilt: DO NOT REMOVE. THIS IS REQUIRED.
public class KiltHelper {
    public static void thisMayLookUselessButItsNotLmao() {
        // You might be wondering, "What is this class for?", and noticed that it's empty.
        // The reason why this class is required is because Fabric mods like CreativeCore bundle EventBus in their mods,
        // but Kilt bundles a fork that fixes some issues with the ASM implementation.
        // As a result, Kilt needs something to hook onto to forcefully load our fork, so this is here
        // for our sake.
    }
}
